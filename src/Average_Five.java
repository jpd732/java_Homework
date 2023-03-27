//importing builtin Scanner

import java.util.Scanner;
//Creating a new java class

public class Average_Five

{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    public void average()
    {
        //Sout to take first number
        System.out.println("Please enter first number: ");
       //Taking input of number one.
       double a = scanner.nextDouble();

        //Sout to take second number
        System.out.println("Please enter second number: ");
        //Taking input of number two.
        double b = scanner.nextDouble();

        //Sout to take third number
        System.out.println("Please enter third number: ");
        //Taking input of number three.
        double c = scanner.nextDouble();

        //Sout to take fourth number
        System.out.println("Please enter fourth number: ");
        //Taking input of number four.
        double d = scanner.nextDouble();

        //Sout to take fifth number
        System.out.println("Please enter fifth number: ");
        //Taking input of number five.
        double e = scanner.nextDouble();

        //Calculating average
        double average_f = (a+b+c+d+e)/5;
        System.out.println("The average of the above five numbers is: " + average_f);

        //Sout for average



    }
//Creating main method
public static void main(String[] args)
{
    //Creating class object to call non-static method in static main method.
    Average_Five average_five = new Average_Five();

    //Calling method using class object in order to execute the program of leap year.
    average_five.average();
}

}
