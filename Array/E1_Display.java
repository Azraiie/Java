package Array;

import java.util.ArrayList;

public class E1_Display
{
    public static ArrayList<String[]> mainList = new ArrayList<>();

    public static void main(String[] args)
    {
        // Array variable.
        String[] array = {
                "Azraiie",
                "24",
                "Coding"
        };

        // Add the array element to the ArrayList.
        mainList.add(array);

        // Display the ArrayList using the displayList() method.
        displayList();
    }

    public static void displayList()
    {
        // Check if the ArrayList is empty.
        if (mainList.isEmpty())
        {
            System.out.println("The ArrayList is empty.");
        }
        else
        {
            // Print the ArrayList.
            for (String[] array : mainList)
            {
                for (String element : array)
                {
                    System.out.println(element);
                }
            }
        }
    }
}
