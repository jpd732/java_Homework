//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class


public class Positive_Negative
{

    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

//creating method to build a function
    public void P_N_Z()
    {
        //Asking user for input
        System.out.println("Please enter number: ");
        int no = scanner.nextInt();

        //if else if statement to check number is positive,negative or zero

        if (no > 0)
        {
            System.out.println("number is positive");
        }
        else if (no < 0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is equals to zero");
        }

    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Positive_Negative positive_negative = new Positive_Negative();

        //Calling method using class object in order to execute the program of leap year.
        positive_negative.P_N_Z();


    }




}
