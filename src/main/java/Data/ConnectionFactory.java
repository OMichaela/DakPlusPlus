package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                url:"jdbc:mysql://moktok.javawebdev.com:33306/myDB";
                user:"michaela";
                password:"michaela2020";
        );

        String sql = "SELECT * FROM Team";
        Statement statement = connection.createStatement();

        System.out.println("Connection created with DB");
    }

    public static Connection getConnection() {
    }
}
