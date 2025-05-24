package exercises;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the triangle");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if(n1 == n2 && n2 == n3)
        {
            System.out.println("This is the Equilateral triangle");
        }
        else if(n1 == n2 || n2 == n3)
        {
            System.out.println("This is the Isosceles triangle");
        }
        else
        {
            System.out.println("This is the Scalene triangle");
        }
    }
}
