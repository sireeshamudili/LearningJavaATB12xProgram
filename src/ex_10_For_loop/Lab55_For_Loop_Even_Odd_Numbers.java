package ex_10_For_loop;

public class Lab55_For_Loop_Even_Odd_Numbers {
    public static void main(String[] args) {

        // TO find the even numbers from 1 to 50
        // even -> i%2 ==0

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
            }
            else
            {
                System.out.println("Odd -> " +i);
            }
        }

    }
}
