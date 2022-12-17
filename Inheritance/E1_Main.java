package Inheritance;

public class E1_Main
{
    public static void main(String[] args)
    {
        // Create an instance of the parent and child classes.
        E1_Parent parent = new E1_Parent();
        E1_Parent child = new E1_Child();

        // Call the print() method on the parent and child classes.
        parent.print();
        child.print();
    }
}
