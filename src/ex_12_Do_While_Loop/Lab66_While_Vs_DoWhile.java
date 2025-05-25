package ex_12_Do_While_Loop;

public class Lab66_While_Vs_DoWhile {
    public static void main(String[] args) {

        //While
        //Condition is false so the loop terminates and doesn't give the output
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }

        //do....while
        //Statement will execute once if the while condition is false.
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i<0);
    }
}
