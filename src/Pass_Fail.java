//importing builtin Scanner
import java.util.Scanner;


//Creating a new java class

public class Pass_Fail
{
    //Calling Scanner method to take input from user.
    Scanner scanner = new Scanner(System.in);

    //Creating new method to calculate total and grade of the student.
    public void pass1_fail1() {
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
        int Total = Math + Science + English;
        System.out.println("Total of three subjects is: " + Total);

        //Creating variable Total to store percentage.
        double percentage = Total / 300.0 * 100.0;
        System.out.println("Percentage is: " + percentage);


        //Creating if else statement in order to check that student has passed each subject individually.
        if (Math >= 35 && Science >= 35 && English >= 35) {
            System.out.println(name + " has passed the exam");
        } else {
            System.err.println(name + " is failed because he did not pass in all three individual subjects.");
        }




    }
    //Main method for execution of program
    public static void main (String[]args)
    {
        //Creating class object to call non-static method in static main method.
        Pass_Fail pass_fail = new Pass_Fail();

        //Calling method using class object in order to execute the program of leap year.
        pass_fail.pass1_fail1();


    }
}