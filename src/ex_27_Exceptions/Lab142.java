package ex_27_Exceptions;

public class Lab142 {
    public static void main(String[] args) {

        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
