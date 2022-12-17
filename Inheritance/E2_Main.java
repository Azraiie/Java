package Inheritance;

public class E2_Main
{
    public static void main(String[] args)
    {
        // Create an instance of the child class.
        E2_Child child = new E2_Child();

        // Print the parent and child variables.
        System.out.println("This is the " + child.parent + " class.");
        System.out.println("This is the " + child.child + " class.");
    }
}
