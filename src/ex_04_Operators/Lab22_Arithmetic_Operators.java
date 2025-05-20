package ex_04_Operators;

public class Lab22_Arithmetic_Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        // + (Addition)
        // - (Subtraction)
        // * (Multiplication)
        // / (Division)
        //  % (Modulus) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println(a / c);

        //Modulus Operator
        int a1 = 20;
        int b1 = 10;
        System.out.println(a1%b1); // Mod -> Remainder.

        // 10 | 20 |  2 - quotient
        //    | 20 |
        //    -------
        //       0 - Remainder
        //    -------

         System.out.println(13%7);
        //  7 | 13 | 1 - Q
        //    |  7 |
        //    -------
        // R     6
        //    -------
    }
}
