package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Utils {

    private static ConnectionFactory connectionFactory;

    public static ConnectionFactory getInstance() {

        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }

        return connectionFactory;
    }

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.err.println("Failed to load PostgreSQL Driver");
            throw new RuntimeException(e); // fail fast
        }
    }

    private Properties Pro = new Properties();

    private Utils() {
        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
        } catch (Exception e) {
            System.err.println("Failed to load.");
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() throws SQLException {

        Connection conn = DriverManager.getConnection(pro.getProperty("db-url"),
                pro.getProperty("db-username"),
                pro.getProperty("db-password"));

        if (conn == null) {
            throw new RuntimeException("Could not create connection ");
        }
        return conn;

    }

}