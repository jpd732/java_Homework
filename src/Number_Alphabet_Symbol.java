//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class

public class Number_Alphabet_Symbol
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void check_input()
    {
        //using sout and char input to tell and take input from user.
        System.out.println("Please input number between (0-9) or any alphabet or symbol.");

        char input = scanner.next().charAt(0);

        //using if else statement to check if the input is alphabet, number or symbol.

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
        {
            System.out.println("The entered input is an ALPHABET");
        }
        else if (input >= '0' && input <= '9')
        {
            System.out.println("The entered input is a NUMBER");
        }
        else
        {
            System.out.println("The entered input is a SYMBOL or SPECIAL CHARACTER");
        }

    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Number_Alphabet_Symbol number_alphabet_symbol = new Number_Alphabet_Symbol();

        //Calling method using class object in order to execute the program of leap year.
        number_alphabet_symbol.check_input();


    }



}
