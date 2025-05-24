package ex_10_For_loop;

public class Lab53_For_Loop_Outside_Initialization {
    public static void main(String[] args) {

        for (int i = -1; i > -10 ; i--) {
            System.out.println(i);
        }

        //We can Initialize the value outside of the loop
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
}
