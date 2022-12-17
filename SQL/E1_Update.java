package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E1_Update extends E1_Connect
{
    static int id = 1;
    static String name = "Balqish";
    static String course = "Psychology";
    static String role = "Student";

    public static void main(String[] args)
    {
        E1_Update e1_update = new E1_Update();
        e1_update.updateData();
    }

    public void updateData()
    {
        try
        {
            // Create a connection to the database.
            Connection connection = this.connection();

            // SQL query.
            String query = "UPDATE User SET " +
                    "User_Name = ?, " +
                    "User_Course = ?, " +
                    "User_Role = ? " +
                    "WHERE User_ID = ?";

            // Create a prepared statement.
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the parameters for User_ID, User_Name, User_Course, User_Role.
            statement.setString(1, name);
            statement.setString(2, course);
            statement.setString(3, role);
            statement.setInt(4, id);

            // Execute the query.
            statement.executeUpdate();

            // Close the connection.
            connection.close();

            // Print a message to the console.
            System.out.println("Data updated successfully.");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
