package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class E1_Connect
{
    // TODO: You're require to use JDBC driver to connect to the database.
    // The JDBC driver is a Java library that allows you to connect to the database.
    public void connection()
    {
        Connection connection = null;
        try
        {
            // Database URL.
            String link = "jdbc:sqlite:./SQL/Database.db";

            // Create a connection to the database using the DriverManager.
            connection = DriverManager.getConnection(link);

            System.out.println("Connection to SQLite has been established.");
        }
        catch (SQLException e_sql)
        {
            System.out.println(e_sql.getMessage());
        }
        finally
        {
            try
            {
                // Check if the connection is not closed.
                if (connection != null)
                {
                    connection.close();
                }
            }
            catch (SQLException e_sql)
            {
                System.out.println(e_sql.getMessage());
            }
        }
    }

    public static void main(String[] args)
    {
        // Create an instance of the E1_Connect class.
        E1_Connect e1_connect = new E1_Connect();

        // Call the connection() method.
        e1_connect.connection();
    }
}
