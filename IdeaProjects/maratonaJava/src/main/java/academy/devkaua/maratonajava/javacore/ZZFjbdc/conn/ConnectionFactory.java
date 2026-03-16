package academy.devkaua.maratonajava.javacore.ZZFjbdc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5433/postgres";
        String username = "postgres";
        String password = "1234";

        return DriverManager.getConnection(url, username, password);
    }

}
