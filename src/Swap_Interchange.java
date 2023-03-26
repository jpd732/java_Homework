//importing builtin Scanner

import java.util.Scanner;
//Creating a new java class

public class Swap_Interchange

{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    public void Interchange()
    {
        //Asking user to put input number one
        System.out.println("Enter your number one: ");
        int a = scanner.nextInt();

        //Asking user to put input number two
        System.out.println("Enter your number two: ");
        int b = scanner.nextInt();

        //Declaring new variable to store value of a
        int c = a;

        //Exchanging the values of two numbers
        a = b;
        b = c;

        System.out.println("Interchanged value is " + a + " and " +
                "" +b);

    }

public static void main(String[] args)
{
    //Creating class object to call non-static method in static main method.
    Swap_Interchange interchange = new Swap_Interchange();

    //Calling method using class object in order to execute the program of leap year.
    interchange.Interchange();
}



}
