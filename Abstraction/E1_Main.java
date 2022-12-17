package Abstraction;

public class E1_Main
{
    public static void main(String[] args)
    {
        // Create an instance of the child class.
        E1_Parent e1_parent = new E1_Child();

        // Call the print() method on the child class.
        e1_parent.print();
    }
}
