//importing builtin Scanner
import java.util.Scanner;
//Creating a new java class
public class Grades

{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //Creating new method to calculate total and grade of the student.
    public void Student_Grade()
    {
        //Printing sout to take user input for student name.
        System.out.println("Please enter student name: ");
        String name = scanner.nextLine();

        //Printing sout to take user input for student roll number.
        System.out.println("Please enter student Roll number: ");
        int roll_no = scanner.nextInt();

        //Printing sout to take user input of marks for subject Maths.
        System.out.println("Please enter marks of Maths: ");
        int Math = scanner.nextInt();

        //Printing sout to take user input of marks for subject Science.
        System.out.println("Please enter marks of Science: ");
        int Science = scanner.nextInt();

        //Printing sout to take user input of marks for subject English.
        System.out.println("Please enter marks of English: ");
        int English = scanner.nextInt();


        //Creating variable Total to store total addition of 3 subjects.
        int Total = Math+Science+English;
        System.out.println("Total of three subjects is: " + Total);

        //Creating variable Total to store percentage.
        double percentage = Total / 300.0 * 100.0;
        System.out.println("Percentage is: " + percentage);


        //Creating if else statement in order to check grade according to percentage.
        if (percentage >= 80.00 )
        {
            System.out.println("Grade is: A+");
            System.out.println(name + " has passed the exam");
        }
        else if (percentage >= 60.00 && percentage < 80.00)
        {
            System.out.println("Grade is A");
            System.out.println(name + " has passed the exam");
        }
        else if (percentage >= 50.00 && percentage < 60.00)
        {
            System.out.println("Grade is B");
            System.out.println(name + " has passed the exam");
        }
        else if (percentage >= 35.00 && percentage < 50.00)
        {
            System.out.println("Grade is C");
            System.out.println(name + "has passed the exam");
        }
        else
        {
            System.err.println(name + " is failed");
        }












    }









    public static void main(String[] args)
    {
        //Creating class object to call non-static method in static main method.
        Grades grade = new Grades();

        //Calling method using class object in order to execute the program of leap year.
        grade.Student_Grade();


    }




}
