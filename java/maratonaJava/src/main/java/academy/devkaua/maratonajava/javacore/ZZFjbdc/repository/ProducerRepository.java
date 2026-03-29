package academy.devkaua.maratonajava.javacore.ZZFjbdc.repository;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.conn.ConnectionFactory;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    // tem framework que ja faz isso por nos.
    public static void saveTrasaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            // ele garante que se der erro, nada entrara no banco de dados...
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            // aqui depois ter passado do metodo, ele poderar entrar
            conn.commit();
            conn.setAutoCommit(true);
        } catch (Exception e) {
            log.error("Error while trying to save producers  '{}'", producers, e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO producer (name) VALUES (?);";
        boolean shouldRollback = false;
        for (Producer p: producers) {
            try (PreparedStatement ps = conn.prepareStatement(sql)){
                log.info("Saving producer '{}'", p.getName());
                ps.setString(1,p.getName());

                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shouldRollback = true;
            }
        }
        if (shouldRollback) {
            log.warn("Transaction is going be rollback.");
            conn.rollback();
        }
    }

    public static void save(Producer producer) {
        String sql = "INSERT INTO producer (name) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int i = stmt.executeUpdate(sql);

            log.info("Inserted producer '{}' in the Database, rows affected '{}'", producer.getName(), i);
        } catch (Exception e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    // "DELETE FROM public.producer WHERE id_producer BETWEEN 3 and 5;";
    public static void delete(int id) {
        String sql = "DELETE FROM producer WHERE id_producer = %d;".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int i = stmt.executeUpdate(sql);

            log.info("Deleted producer '{}' in the Database, rows affected '{}'", id, i);
        } catch (Exception e) {
            log.error("Error while trying to delete id '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE producer SET name = '%s' WHERE id_producer = %d;".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int i = stmt.executeUpdate(sql);

            log.info("Update ID '{}', rows affected '{}'", producer.getId(), i);
        } catch (Exception e) {
            log.error("Error while trying update '{}'", producer.getId(), e);
        }
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {

            int i = ps.executeUpdate();

            log.info("Update ID '{}', rows affected '{}'", producer.getId(), i);
        } catch (Exception e) {
            log.error("Error while trying update '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE producer SET name = ? WHERE id_producer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    public static List<Producer> findName(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM producer WHERE name LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id_producer"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (Exception e) {
            log.error("Error while trying producers name '{}'", name, e);
        }
        return producers;
    }

    public static List<Producer> findNamePreparedStatement(String name) {
        log.info("Finding all Producers by name");       // Usa '?' para se passar uma variavel
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             // cria um metodo para se ter melhor legibilidade do codigo, sem ter que criar outro 'try'
             PreparedStatement ps = preparedStatementFindName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id_producer"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (Exception e) {
            log.error("Error while trying producers name '{}'", name, e);
        }
        return producers;
    }

    // ele valida uma query antes de ir para o banco de dados, gera melhor performa.
    // da uma protecao em SQL injection
    private static PreparedStatement preparedStatementFindName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM producer WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        // usa dessa forma para ser como um LIKE do sql.
        ps.setString(1, "%" + name + "%");
        return ps;
    }

    public static void showProducerMetadata() {
        log.info("Showing Producer Metada");
        String sql = "SELECT * FROM producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetadata = rs.getMetaData();

            int columnCount = rsMetadata.getColumnCount();
            log.info("Column count '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name: '{}'", rsMetadata.getTableName(i));
                log.info("Column name: '{}'", rsMetadata.getCatalogName(i));
                log.info("Column size: '{}'", rsMetadata.getColumnDisplaySize(i));
                log.info("Column type: '{}'", rsMetadata.getColumnTypeName(i));
            }
        } catch (Exception e) {
            log.error("Error while trying finding all producers", e);
        }
    }
}
