package ex_15_Strings_Mutable;

public class Lab82_StringBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World"); //Adds this to the stringBuilder
        stringBuilder.reverse(); //Reverse the text
        System.out.println(stringBuilder);
    }
}
