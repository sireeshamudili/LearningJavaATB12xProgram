package ex_06_TernaryOperator;

public class Lab34_Nested_Ternary {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 21;
        String result = (number > 18) ? (number > 18 ? "You can drive the bike" : "You can't drive") : "You can't go GOA";
        System.out.println(result);
    }
}
