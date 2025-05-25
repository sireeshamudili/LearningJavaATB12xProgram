package exercises;

public class Task_03_Max_Of_3_Num {
    public static void main(String[] args) {

        //Maximum number of 3 numbers using ternary operator

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Logic Building Formula
        // Step 1 ->  Find the inputs and outputs of data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String, we can message with max number

        // Step 2 - Rough Logic
        //  n1 >  n2 and n1 > n3 -> n1
        // n2 > n3 and n2 > n1 -> n2
        // If both n1, n2 are not max num, by default it's n3

        // Step 3 - Dry run program
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);

    }
}
