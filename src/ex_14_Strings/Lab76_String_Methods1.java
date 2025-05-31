package ex_14_Strings;

public class Lab76_String_Methods1 {
    public static void main(String[] args) {

        String s = "ABCD";
        System.out.println(s);

        //s.length() gives to length of a string
        System.out.println(s.length());

        //s.toLowerCase() gives the string into all lower cases
        System.out.println(s.toLowerCase());

        //s.toUpperCase() gives the string into all uppercases
        System.out.println(s.toUpperCase());

        //s.concat() adds in the end of the string
        System.out.println(s.concat("E"));

        //Calculates the Index from 0,1,2,3,4.....
        CharSequence s1 = "Siri".subSequence(1,3);
        System.out.println(s1); //ir
    }
}
