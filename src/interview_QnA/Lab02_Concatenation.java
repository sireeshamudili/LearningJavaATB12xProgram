package interview_QnA;

public class Lab02_Concatenation {
    public static void main(String[] args) {

        //Ex1:
        // concatenation
        String s1 = "Hi";
        String s2 = "World";
        System.out.println(s1 + s2); // Joins

        int a = 10;
        int b = 20;
        System.out.println(a + b); // Math

        // + -> behave differently with the data type.
        // + -> operator overloading

        //Ex2:
        String first_name = "Hello";
        String last_name = "People";

        int a1 = 10;
        int b1 = 10;

        System.out.println(first_name + last_name + a + b); // HelloPeople1010
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

    }
}
