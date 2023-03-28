//importing builtin Scanner
import java.util.Objects;
import java.util.Scanner;
//Creating a new java class




public class City_Name
{
    //Calling Scanner method to take input from user.
    Scanner stringScanner = new Scanner(System.in);

    //creating method to build a function
    public void Alphabet()
    {
        //Asking user to input alphabet from a-f.
        System.out.println("Please enter any alphabet between a-f");
       //creating input variable alphabet
        String alphabet = stringScanner.next();

        //Creating if else statement to print city name according to alphabet

        if (Objects.equals(alphabet, "a") || Objects.equals(alphabet, "A"))
        {
            System.out.println("The city name is: Arlington");
        }
        else if (Objects.equals(alphabet, "b") || Objects.equals(alphabet, "B"))
        {
            System.out.println("The city name is: Baroda");
        }
        else if (Objects.equals(alphabet, "c") || Objects.equals(alphabet, "C"))
        {
            System.out.println("The city name is: Carlington");
        }
        else if (Objects.equals(alphabet, "d") || Objects.equals(alphabet, "D"))
        {
            System.out.println("The city name is: Dahod");
        }
        else if (Objects.equals(alphabet, "e") || Objects.equals(alphabet, "E"))
        {
            System.out.println("The city name is: Eustion");
        }
        else if (Objects.equals(alphabet, "f") || Objects.equals(alphabet, "F"))
        {
            System.out.println("The city name is: Florence");
        }
        else
        {
            System.err.println("Invalid entry. Please enter alphabet between a-f.");
        }


    }


    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        City_Name city_name = new City_Name();

        //Calling method using class object in order to execute the program of leap year.
        city_name.Alphabet();


    }














}
