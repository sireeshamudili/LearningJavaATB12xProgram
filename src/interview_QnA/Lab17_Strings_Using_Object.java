package interview_QnA;

public class Lab17_Strings_Using_Object {
    public static void main(String[] args) {

        //We can multiple strings in single class
        String s1 = "Hello";
        String s4 = "Hello";

        //Object area
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String => this check the reference location
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);


        // equals ( content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> siri. Siri, SIRI , SiRi . SirI ==> siri
        //  == check for the reference
        // = assignment the value
    }
}
