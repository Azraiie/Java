package Array;

import java.util.ArrayList;

public class E1_Add
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

        // Call the addList() method to store the array in the ArrayList.
        addList(array);
    }

    public static void addList(String[] list)
    {
        // Add the array variable to the ArrayList.
        mainList.add(list);
    }
}
