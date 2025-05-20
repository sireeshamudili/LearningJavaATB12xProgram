package ex_06_TernaryOperator;

public class Lab33_Ternary_Operator {
    public static void main(String[] args) {

        //Ex:1
        //  Result = Condition ? Expression1 : Expression2
        int age = 27;
        String canIGoTOCollege =  age > 18 ? "Yes You can" : "You can't";
        System.out.println(canIGoTOCollege);

        //Ex:2
        int number = 5;
        String result = number > 0 ? "positive" : "negative";
        //int result = number > 0 ? "positive" : "negative";
        System.out.println(result);
    }
}
