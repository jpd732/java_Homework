//importing builtin Scanner

import java.util.Scanner;
//Creating a new java class

public class Gross_Salary
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    public void gross1_salary1()
    {
        //Sout to take input employee id
        System.out.println("Please enter your employee id in integer:");
        int employee_id = scanner.nextInt();

        //Sout to take input name.
        System.out.println("Please enter your name:");
        String name = scanner.next();

        //Sout to take basic salary
        System.out.println("Please enter your basic salary");
        int basic_salary = scanner.nextInt();

        //Finding HRA
        double HRA = basic_salary * (10.0/100.0);
        System.out.println("Your HRA is: " + HRA);

        //Finding TA
        double TA = basic_salary * (9.0/100.0);
        System.out.println("Your TA is: " + TA);

        //Finding DA
        double DA = basic_salary * (8.0/100.0);
        System.out.println("Your DA is: " + DA);

        //Finding PF
        double PF = basic_salary * (20.0/100.0);
        System.out.println("Your PF is: " + PF);

        //Finding Gross salary
        double gross_salary = basic_salary+HRA+TA+DA-PF;
        System.out.println("Your gross salary is: " + gross_salary);


    }

    //Creating main method for execution of program.

    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Gross_Salary gross2_salary2 = new Gross_Salary();

        //Calling method using class object in order to execute the program of leap year.
        gross2_salary2.gross1_salary1();

    }

}
