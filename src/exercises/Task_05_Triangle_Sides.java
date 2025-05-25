package exercises;

import java.util.Scanner;

public class Task_05_Triangle_Sides {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter side1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side3: ");
        int side3 = scanner.nextInt();

        // Check if the sides can form a triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {

            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Not a valid triangle.");
        }

        scanner.close();
    }
}
