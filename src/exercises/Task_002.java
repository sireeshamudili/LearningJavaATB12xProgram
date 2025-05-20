package exercises;

public class Task_002 {
    public static void main(String[] args) {

        //1) Finding the number even or odd using ternary operator

        // Step 1 ->  Input, Output - data type
        int num = -13;
        // input -> int
        // output -> String -> even or odd

        // Step 2
        // num%2 == 0 >  even else odd.
        String result = (num%2==0) ? "even" : "odd";
        System.out.println(result);

        //2)Maximum number of 3 numbers using ternary operator

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

        //3)Finding the user's age is Adult/Minor/Senior from giving User inputs

        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        String user_input = args[0]; //Passing the arguments in Edit Configurations
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        //Changing String to Int
        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String res = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(res);

        // OR
        // int age=25;
        // String res=(age<18) ? "Minor" : (age<65) ? "Adult" : "Senior citizen";
        // System.out.println(res);
    }
}
