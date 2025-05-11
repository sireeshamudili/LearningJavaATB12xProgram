package ex_02_Java_Basics_Part2;

public class Lab17_Constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        final int b = 99;
        // b =11;  cannot assign a value to final variable b
        System.out.println(b);

        //b = b+1;
        System.out.println(b);

        final float PI = 3.14f;
        // PI=7989; Cannot assign a value to final variable 'PI'

        System.out.println(PI);
    }
}
