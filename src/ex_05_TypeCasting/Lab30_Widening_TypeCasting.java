package ex_05_TypeCasting;

public class Lab30_Widening_TypeCasting {
    public static void main(String[] args) {

        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
                   // Implicit - Casting - Widening

        byte b1 = 10;
        int a1 = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a2 = (int)b; // Widening Explicit Casting (int) - optional

    }
}
