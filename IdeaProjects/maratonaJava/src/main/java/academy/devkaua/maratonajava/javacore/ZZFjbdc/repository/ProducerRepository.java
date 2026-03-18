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

            log.info("Database rows affected{}",i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
