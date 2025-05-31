package ex_14_Strings;

public class Lab78_String_Methods3 {
    public static void main(String[] args) {

        String s= "Java";
        char c = s.charAt(2);
        // Index = 0,1,2....
        System.out.println(c);

        System.out.println(s.codePointAt(0));

        //We cannot the compare the Upper/Lower cass

        // CompareToIgnore(Sting sr)
        // int result = "abc".compareTo("ABC");
        // int result1 = "abc".compareToIgnoreCase("ABC");
        // System.out.println(result);
        // System.out.println(result1);

        //It gives only Index no of string
        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        //It gives last index of string
        int idx2 = "Java".lastIndexOf("a"); // 3
        System.out.println(idx2);

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        //It joins both strings
        String s11 = String.join(" AND ", "Java", "Python");
        System.out.println(s11);

        //It replaces char with another char
        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        //It gives whether the string with true/false
        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1); // true
    }
}
