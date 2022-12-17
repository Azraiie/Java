package Interface;

public class E2_Extend implements E2_1_Interface, E2_2_Interface
{
    public void wake()
    {
        System.out.println("I'm waking up!");
    }
    public void sleep()
    {
        System.out.println("Time to sleep!");
    }
}
