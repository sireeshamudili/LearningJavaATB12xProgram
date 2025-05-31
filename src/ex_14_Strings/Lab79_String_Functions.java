package ex_14_Strings;

public class Lab79_String_Functions {
    public static void main(String[] args) {

        // String s1="HELLO"; // SCP
        // String s2= new String("world"); // OA

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("World");
        System.out.println(str1 == str2); //true Cuz both are in the SCP
        System.out.println(str1 == str3); //false Cuz one string is SCP and other one is OA

        System.out.println(str1.equals(str3)); //false Cuz "equals" method, Both string names are same
                                               //true if both s1 and s3 have same string names

        System.out.println(str1.concat(str3)); //HelloWorld Cuz concat adds in the end of the string
    }
}