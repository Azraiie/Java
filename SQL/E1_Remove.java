package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class E1_Remove extends E1_Connect
{
    static int id = 1;

    public static void main(String[] args)
    {
        E1_Remove e1_remove = new E1_Remove();
        e1_remove.removeData();
    }

    public void removeData()
    {
        try
        {
            // Create a connection to the database.
            Connection connection = this.connection();

            // SQL query.
            String query = "DELETE FROM User WHERE User_ID = ?";

            // Create a prepared statement.
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the parameters of the query for User_ID.
            statement.setInt(1, id);

            // Execute the query.
            statement.executeUpdate();

            // Close the connection.
            connection.close();

            // Print a message to the console.
            System.out.println("Data removed successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
