package ex_02_Java_Basics_Part2;

public class Lab12_Variables {
    public static void main(String[] args) {

        // data_type variable_name =  variable_value

        byte b = 65;
        // short age = 65;
        // byte -> data type - type of container
        //  age ->  variable_name |  identifier
        // = -> Assignment Operator
        // 65 -> Variable Value |  Literal

        b = 67;
        System.out.println(b);

        // -------------------------
        int age1 = 10;
        age1 = 65+1;
        System.out.println(age1);

        // -------------------------
        int age2 = 76;
        age2 = age2+1;
        age2 = 76;
        System.out.println(age2);
    }
}
