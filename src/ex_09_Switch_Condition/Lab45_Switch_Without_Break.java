package ex_09_Switch_Condition;

import java.util.Scanner;

public class Lab45_Switch_Without_Break {
    public static void main(String[] args) {

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 7 -> sun
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid, day number");

                //Without break; keyword, the program runs all the cases.
                // if we want to run one case we have to use break keyword after every statement
        }
    }
}
