package ex_14_Strings;

import java.util.Locale;

public class Lab75_String_Immutable {
    public static void main(String[] args) {

        //Case1:
        String name = "siri";
        name.toUpperCase();
        System.out.println(name); //siri
        //It will give siri..cuz Strings are Immutable(We cannot change)

        //Case2:
        String s1 = "Hello";
        s1 = s1.concat("World");
        System.out.println(s1); //HelloWorld
        //We are using = operator and concat and printing
    }
}
