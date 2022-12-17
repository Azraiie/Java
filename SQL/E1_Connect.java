package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class E1_Connect
{
    // TODO: You're require to use JDBC driver to connect to the database.
    // The JDBC driver is a Java library that allows you to connect to the database.
    public Connection connection()
    {
        Connection connection = null;
        try
        {
            // Database URL.
            String link = "jdbc:sqlite:./SQL/Database.db";

            // Create a connection to the database using the DriverManager.
            connection = DriverManager.getConnection(link);

            // Use this to check if the connection is successful.
            // System.out.println("Connection to SQLite has been established.");
        }
        catch (SQLException e_sql)
        {
            System.out.println(e_sql.getMessage());
        }
        return connection;
    }
}
