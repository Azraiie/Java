package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class E1_Add extends E1_Connect
{
    static int id = 1;
    static String name = "Azraiie";
    static String course = "Coding";
    static String role = "Student";

    public static void main(String[] args)
    {
        E1_Add e1_add = new E1_Add();
        e1_add.addData();
    }

    public void addData()
    {
        try
        {
            // Create a connection to the database.
            Connection connection = this.connection();

            // SQL query.
            String query = "INSERT INTO User" +
                    "(User_ID, " +
                    "User_Name, " +
                    "User_Course, " +
                    "User_Role) " +
                    "VALUES(?,?,?,?)";

            // Create a prepared statement.
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the parameters of the query for VALUES.
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, course);
            statement.setString(4, role);

            // Execute the query.
            statement.executeUpdate();

            // Close the connection.
            connection.close();

            // Print a message to the console.
            System.out.println("Data added successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
