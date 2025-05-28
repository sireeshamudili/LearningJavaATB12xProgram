package exercises;

import java.util.Scanner;

public class Task_09_Months_NumOfDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        System.out.println("Enter the month name");
        int monthNum = scanner.nextInt();

        switch(monthNum)
        {
            case 1:
                System.out.println("January - 31 days");
                break;

            case 2:
                if((year %4 ==0  && year %100 !=0) || year %400 ==0)
                {
                    System.out.println("February - It's a leap year 29 days");
                }
                else
                {
                    System.out.println("February - 28 days");
                }
                break;

            case 3:
                System.out.println("March - 31 days");
                break;

            case 4:
                System.out.println("April - 30 days");
                break;

            case 5:
                System.out.println("May - 31 days");
                break;

            case 6:
                System.out.println("June - 30 days");
                break;

            case 7:
                System.out.println("July - 31 days");
                break;

            case 8:
                System.out.println("August - 31 days");
                break;

            case 9:
                System.out.println("September - 30 days");
                break;

            case 10:
                System.out.println("October - 31 days");
                break;

            case 11:
                System.out.println("November - 30 days");
                break;

            case 12:
                System.out.println("December - 31 days");
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
}
