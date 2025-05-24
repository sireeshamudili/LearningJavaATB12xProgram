package exercises;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

        // Create a program that will basically be based on
        // the alphabet and also based on the grade.
        // You will give the message to the kid if you got
        // excellent, very good, good, needs improvement, fail
        // A -> Excellent, B -> Best, C -> Very Good, D -> Good, E -> Needs Improvement, F -> Fail

        int grade = 'F';
        switch(grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Best");
                break;
            case 'C':
                System.out.println("Very Good");
                break;
            case 'D':
                System.out.println("Good");
                break;
            case 'E':
                System.out.println("Needs Improvement");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }

        //Using Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Grade");
        String grade1 = scanner.next();
        grade1 = grade1.toLowerCase();
        switch(grade1)
        {
            // ...............
        }
    }


}
