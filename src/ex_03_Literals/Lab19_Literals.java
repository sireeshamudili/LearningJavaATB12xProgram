package ex_03_Literals;

public class Lab19_Literals {
    public static void main(String[] args) {
        int age = 65;
        // Literal - Integral

        final float pi = 3.14f;
        //  Literal - float

        final int girl_age = 18;
        //girl_age = 19;

        System.out.println(girl_age);

        //--------------------
        int Enum = 9; // enum is keyword
        System.out.println(Enum);

        //--------------------
        int age2 = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10

        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        //-------------------
        boolean is_married = true;
        boolean is_married_amit = false;
        //boolean is_married_amit = 123;
    }

}
