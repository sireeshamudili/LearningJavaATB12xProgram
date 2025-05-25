package interview_QnA;

import java.util.Scanner;

public class Lab14_While_With_Factorial {
    public static void main(String[] args) {

        // Factorial Program

        // The logic building formula we are discussing.
        // 1) you have to figure out what is the data type for input and output.
        // 2) write a rough logic around this.
        // 3) write a proper logic around this.
        // 4) optimize.
        // 5) which is edge cases.

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number, which factorial you want!");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the int,rerun the program");
        }

        int number = scanner.nextInt();
        int factorial = 1;

        if(number == 0){
            System.out.println("factorial is -> "+factorial);
        }

        if(number >  Integer.MAX_VALUE){
            System.out.println("Can't get the factorial as out of bound!(int)");
        }

        int i = 1;
        while(i<=number){
            factorial = factorial*i;
            i++;
        }

        System.out.println("factorial is -> "+factorial);
    }
}
