package academy.devkaua.maratonajava.javacore.ZZFjbdc.repository;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.conn.ConnectionFactory;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Statement;

public class ProducerRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

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
}
