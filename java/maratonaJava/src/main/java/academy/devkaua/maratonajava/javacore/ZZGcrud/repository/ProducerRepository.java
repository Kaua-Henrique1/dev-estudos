package academy.devkaua.maratonajava.javacore.ZZGcrud.repository;


import academy.devkaua.maratonajava.javacore.ZZGcrud.conn.ConnectionFactory;
import academy.devkaua.maratonajava.javacore.ZZGcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static Optional<Producer> findId(Integer id) {
        log.info("Finding Producer by Id");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindId(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer
                    .builder()
                    .id(rs.getInt("id_producer"))
                    .name(rs.getString("name"))
                    .build());
        } catch (Exception e) {
            log.error("Error while trying find all producers", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement preparedStatementFindId(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM producer WHERE id_producer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static List<Producer> findName(String name) {
        log.info("Finding Producer by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
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

    private static PreparedStatement preparedStatementFindName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM producer WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementDelete(conn, id)) {

            ps.execute();
            log.info("Deleted producer '{}' from Database", id);
        } catch (Exception e) {
            log.error("Error while trying to delete id '{}'", id, e);
        }
    }

    private static PreparedStatement preparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM producer WHERE id_producer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementSave(conn, producer);) {

            ps.execute();

        } catch (Exception e) {
            log.error("Error while trying to save producers  '{}'", producer, e);
        }
    }

    private static PreparedStatement preparedStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO producer (name) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer'{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = updatePreparedStatement(conn, producer)) {
            ps.execute();
        } catch (Exception e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static PreparedStatement updatePreparedStatement(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE producer SET name = ? WHERE id_producer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }


}