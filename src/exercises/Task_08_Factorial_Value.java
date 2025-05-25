package exercises;

import java.util.Scanner;

public class Task_08_Factorial_Value {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Factorial value");
        int n = scanner.nextInt();
        int factorial = 1;
        if( n == 0){
            factorial = 1;
        }

//        if(n > Integer.MAX_VALUE){ // if(n > 2147483647){
//            System.out.println("I can't handle the number > Max of Int");
//        }

        for (int i = 1; i <= n ; i++) {
            factorial = factorial*i;
        }

        System.out.println(factorial);

    }
}
