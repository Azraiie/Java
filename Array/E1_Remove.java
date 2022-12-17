package Array;

import java.util.ArrayList;

public class E1_Remove
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

        // Remove the array element from the ArrayList using the removeList() method.
        removeList(array);
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
}
