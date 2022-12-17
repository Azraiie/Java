package Encapsulation;

public class E1_Main
{
    public static void main(String[] args)
    {
        // Create an instance of the E1_Private class.
        E1_Private e1_private = new E1_Private();

        // Set the name and age.
        e1_private.setName("Azraiie");
        e1_private.setAge(24);

        // Print the getName() and getAge() methods.
        System.out.println("Name: " + e1_private.getName());
        System.out.println("Age: " + e1_private.getAge());
    }
}
