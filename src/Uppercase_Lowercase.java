//importing builtin Scanner
import java.util.Scanner;

//Creating a new java class



public class Uppercase_Lowercase
{

    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void Upper_Lower()
    {
        //sout to tell user to enter alphabets.
        System.out.println("Please enter any alphabet in uppercase: ");
        //creating input to take alphabets as input from user
        String a = scanner.next();

        //Using concatenation and also using inbuilt method to print output in lowercase.
        System.out.println("The letter in lowercase is: " + a.toLowerCase());
    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Uppercase_Lowercase uppercase_lowercase = new Uppercase_Lowercase();

        //Calling method using class object in order to execute the program of leap year.
        uppercase_lowercase.Upper_Lower();


    }






}
