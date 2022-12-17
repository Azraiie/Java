package Array;

import java.util.ArrayList;

public class E1_Update
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

        // Use this to update the data in the ArrayList using the updateList() method.
        updateList(array);
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
            list[0] = "Sushii";
            list[1] = "27";
            list[2] = "Programming";

            // Use for() loop to print the updated elements.
            for (String element : list)
            {
                System.out.println(element);
            }
        }
    }
}
