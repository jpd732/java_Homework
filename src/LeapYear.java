//importing builtin Scanner
import java.util.Scanner;


//Creating a new java class
public class LeapYear
{

    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //Creating method for checking the given input year is leap year or not.

    public void leap_year()
    {
        //Sout statement to print message to ask user for input
        System.out.println("Please enter the year in integer:");
        int leapyear = scanner.nextInt();


        //Creating if else statement to verify that the user input year is a leap year or not.
        if (leapyear % 4 == 0)
        {
            System.out.println(leapyear + " is a leap year");
        }

        //Creating else statement for if the input year is not a leap year.
        else
        {
            System.out.println(leapyear + " is not a leap year");
        }


    }



    //Creating main method for executing program.
public static void main(String[] args)

        {
            //Creating class object to call non-static method in static main method.
        LeapYear leap1 = new LeapYear();

            //Calling method using class object in order to execute the program of leap year.
        leap1.leap_year();

        }


}
