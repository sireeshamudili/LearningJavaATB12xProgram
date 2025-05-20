package ex_07_Incr_Decr_Operator;

public class Lab41_Decrement_Operator {
    public static void main(String[] args) {

        //Ex1:
        int a = 10;
        int result_post = a--;
        System.out.println(result_post); // 10
        System.out.println(a); //9

        //Ex2:
        int a1= 10;
        int result = --a; // 9
        System.out.println(result);
        System.out.println(a1); // 9
    }
}
