package Array;

import java.util.ArrayList;

public class E1_Main
{
    public static ArrayList<String[]> mainList = new ArrayList<>();

    public static void main(String[] args)
    {
        // Array variable.
        String[] array = {
                "This is the first element.",
                "This is the second element.",
                "This is the third element."
        };

        // Call the addList() method to store the array in the ArrayList.
        addList(array);

        // Use this to remove the data from the ArrayList.
        // removeList(array);

        // Use this to update the data in the ArrayList.
        // updateList(array);
    }

    public static void addList(String[] list)
    {
        // Add the array variable to the ArrayList.
        mainList.add(list);

        // Print the ArrayList.
        for (String[] array : mainList)
        {
            for (String element : array)
            {
                System.out.println(element);
            }
        }
    }

    public static void removeList(String[] list)
    {
        // Check if the ArrayList is empty.
        if (mainList.isEmpty())
        {
            System.out.println("The ArrayList is empty.");
        }
        else
        {
            // Remove the array variable from the ArrayList.
            mainList.remove(list);
        }
    }

    public static void updateList(String[] list)
    {
        // Check if the ArrayList is empty.
        if (mainList.isEmpty())
        {
            System.out.println("The ArrayList is empty.");
        }
        else
        {
            // Update each element in the array.
            list[0] = "First element updated.";
            list[1] = "Second element updated.";
            list[2] = "Third element updated.";

            // Use for() loop to print the updated elements.
            for (String element : list)
            {
                System.out.println(element);
            }
        }
    }
}
