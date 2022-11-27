package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabaseConnection {
    private static final String url = "jdbc:postgresql://localhost/cursova";
    private static final String user = "postgres";
    private static final String password = "1";
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}