//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class




public class Sales_Commision
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //creating method to build a function
    public void sales()
    {
    //Sout to ask user input
        System.out.println("Please enter sales id: ");
    //using scanner input to take input from user
        int id = scanner.nextInt();

        System.out.println("Please enter seller's name: ");
        String seller_name = scanner.next();

        System.out.println("Please enter seller's sales amount in percentage between 35-2: ");
        int sales_amount = scanner.nextInt();

        System.out.println("Please enter basic salary: ");
        int basic_salary = scanner.nextInt();

        //Formula to calculate commission in percentage.
        double commission = (basic_salary*sales_amount)/100;

        //if else statement to print commission according to question

        if (sales_amount >= 35 && sales_amount < 20)
        {
            System.out.println("Your commission amount is: " + "£" + commission);
        }
        else if (sales_amount >= 20 && sales_amount < 10)
        {
            System.out.println("Your commission amount is: " + "£" + commission);
        }
        else if (sales_amount >= 10 && sales_amount < 5)
        {
            System.out.println("Your commission amount is: " + "£" + commission);
        }
        else if (sales_amount >= 5 && sales_amount < 2)
        {
            System.out.println("Your commission amount is: " + "£" + commission);
        }
        else if (sales_amount >= 2 && sales_amount >= 1)
        {
            System.out.println("Your commission amount is: " + "£" + commission);
        }


    }



    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Sales_Commision sales_commision = new Sales_Commision();

        //Calling method using class object in order to execute the program of leap year.
        sales_commision.sales();


    }









}
