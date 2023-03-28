//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class




public class Vote
{


    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);


    //creating method to build a function
    public void age()
    {
        //Asking user to input age.
        System.out.println("Please enter your age: ");
        //input
        int vote_age = scanner.nextInt();

        //if else statement to check age is above or equal to 18 or not.
        if (vote_age >= 18)
        {
            System.out.println("You are eligible to vote.");
        }
        else
        {
            System.err.println("Sorry you are not eligible to vote as you are not 18 year old.");
        }
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Vote vote = new Vote();

        //Calling method using class object in order to execute the program of leap year.
        vote.age();


    }










}
