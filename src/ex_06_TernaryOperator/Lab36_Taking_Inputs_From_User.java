package ex_06_TernaryOperator;

public class Lab36_Taking_Inputs_From_User {
    public static void main(String[] args) {

        // Take inputs
        String age_string = args[0];
        String a1 = args[1];
        // String a2 = args[2];
        // String a3 = args[3];

        int age = Integer.parseInt(age_string);
        System.out.println("Int -> "+age);

        System.out.println(age_string);
        System.out.println(a1);
        // System.out.println(a2);
        // System.out.println(a3);

        float f1 = Float.parseFloat(a1);
        System.out.println(f1);

        // If the arguments are less -> java.lang.ArrayIndexOutOfBoundsException
    }
}
