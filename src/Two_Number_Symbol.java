//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class






public class Two_Number_Symbol
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void symbol()
    {
        //asking user to input two numbers.
        System.out.println("Please enter number one: ");
        int first = scanner.nextInt();
        System.out.println("Please enter number two: ");
        int second = scanner.nextInt();
        System.out.println("Please enter symbol from +,-,* or /: ");
        String a = scanner.next() ;

        //creating variables to perform function according to user input.
        int addition = first + second;
        int substraction = first - second;
        int multiplication = first * second;
        double division = first / second;

        //if else statement to check what user has input and take action accordingly.
        if (a.equals("+"))
        {
            System.out.println(addition);
        }
        else if (a.equals("-"))
        {
            System.out.println(substraction);
        }
        else if (a.equals("*"))
        {
            System.out.println(multiplication);
        }
        else if (a.equals("/"))
        {
            System.out.println(division);
        }

    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Two_Number_Symbol two_number_symbol = new Two_Number_Symbol();

        //Calling method using class object in order to execute the program of leap year.
        two_number_symbol.symbol();


    }



}
