package ex_06_TernaryOperator;

public class Lab35_Max_Of_Two_Numbers {
    public static void main(String[] args) {

        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        int max = x > y ? x : y;
        System.out.println(max);

        //Using Math Exp
        System.out.println(Math.max(x,y));
    }
}
