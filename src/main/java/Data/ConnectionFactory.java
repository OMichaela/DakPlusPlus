package Data;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://moktok.javawebdev.com:33306/michaela";
    public static final String USER = "michaela";
    public static final String PASS = "michaela2020";


    public static Connection getConnection()
    {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Unsuccessful connection to the database", ex);
        }
    }
}
