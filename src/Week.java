//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class



public class Week
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void week_day()
    {
        //Sout for Taking input from user in number from 1-7.
        System.out.println("Please enter any number between 1-7:  ");
        //Taking input.
        int a = scanner.nextInt();

        //If else statements to check and print week day according to input number.
        if (a == 1)
        {
            System.out.println("The day is MONDAY");
        }
        else if (a == 2)
        {
            System.out.println("The day is TUESDAY");
        }
        else if (a == 3)
        {
            System.out.println("The day is WEDNESDAY");
        }
        else if (a == 4)
        {
            System.out.println("The day is THURSDAY");
        }
        else if (a == 5)
        {
            System.out.println("The day is FRIDAY");
        }
        else if (a == 6)
        {
            System.out.println("The day is SATURDAY");
        }
        else if (a == 7)
        {
            System.out.println("The day is SUNDAY");
        }
        else
        {
            System.err.println("Please enter number between 1-7");
        }
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Week week = new Week();

        //Calling method using class object in order to execute the program of leap year.
        week.week_day();


    }







}
