package ex_13_Functions;

public class Lab71_User_Defined_Methods {
    public static void main(String[] args) {

        int r1 = sum_of_two_number(4,5);
        int r2 = sum_of_two_number(12,45);
        System.out.println(r1);
        System.out.println(r2);
        }

        static int sum_of_two_number(int first,int second){
           return first+second;
    }
}
