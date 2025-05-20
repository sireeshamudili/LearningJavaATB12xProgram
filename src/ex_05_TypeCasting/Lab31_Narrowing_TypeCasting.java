package ex_05_TypeCasting;

public class Lab31_Narrowing_TypeCasting {
    public static void main(String[] args) {

        int val = 300;
        // byte b = val; // Narrowing - Implicit JVM to do it. - Data loss will be there.

        byte b1 = (byte) val; // Narrowing - Explicit JVM to do it. - Data loss will be there.
        System.out.println(b1); // 44

        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - implicit

        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s); // 5866


    }
}
