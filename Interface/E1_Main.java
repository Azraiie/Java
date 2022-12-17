package Interface;

public class E1_Main implements E1_Interface
{
    public static void main(String[] args)
    {
        // Create an instance of the E1_Main class.
        E1_Main e1_main = new E1_Main();

        // Print the print() method.
        e1_main.print();
    }

    @Override
    public void print()
    {
        System.out.println("This is the print() method that was overridden from the E1_Interface interface.");
    }
}
