package exercises;

public class Task_02_Even_Odd_Num {
    public static void main(String[] args) {

        //1) Finding the number even or odd using ternary operator

        // Step 1 ->  Input, Output - data type
        int num = -13;
        // input -> int
        // output -> String -> even or odd

        // Step 2
        // num%2 == 0 >  even else odd.
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
