package academy.devkaua.maratonajava.javacore.ZZFjbdc.repository;

import academy.devkaua.maratonajava.javacore.ZZFjbdc.conn.ConnectionFactory;
import academy.devkaua.maratonajava.javacore.ZZFjbdc.domain.Producer;

import java.sql.Connection;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO producer (name) VALUES ('Kaua');";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            int i = stmt.executeUpdate(sql);
            System.out.println(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
