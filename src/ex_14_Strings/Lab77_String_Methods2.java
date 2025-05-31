package ex_14_Strings;

public class Lab77_String_Methods2 {
    public static void main(String[] args) {

        //It begins where indicates the Index
        String s = "Java".substring(2);
        System.out.println(s); //va

        //It gives starting Index to ending Index
        String s1 = "Java".substring(1, 3);
        System.out.println(s1);

        //It gives the string into different characters
        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        //It remove the spaces
        String st = " Java ".trim();
        System.out.println(st); // "Java"

        //It also gives true/false
        boolean b = "   ".isBlank();
        System.out.println(b);

        //It can repeat the string based on numbers
        String s2 = "ab".repeat(3);
        System.out.println(s2); //ababab

        //It ignores the Upper/Lower cases
        boolean b1 = "Java".equalsIgnoreCase("java");
        System.out.println(b1);

        //It formats with =
        String s3 = String.format("%s = %d", "age", 25);
        System.out.println(s3); // age=25

        //It counts the lines
        long count = "a\nb\nc".lines().count();
        System.out.println(count); //3
    }
}
