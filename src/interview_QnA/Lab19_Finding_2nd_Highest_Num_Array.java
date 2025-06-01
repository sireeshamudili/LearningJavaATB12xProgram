package interview_QnA;

import java.util.Arrays;

public class Lab19_Finding_2nd_Highest_Num_Array {
    public static void main(String[] args) {

        //Using sort method
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);

        //Using without built-in method
        int[] values = {12, 45, 67, 23, 89, 45, 89};
        int highest = 0;
        int secondHighest = 0;

           for (int num : values) {
               if (num > highest) {
                   secondHighest = highest;
                   highest = num;
               }
               else if (num > secondHighest && num != highest) {
                   secondHighest = num;
               }
           }
                System.out.println(secondHighest);
        }
}
