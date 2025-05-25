package exercises;

public class Task_04_User_Age {
    public static void main(String[] args) {

        //Finding the user's age is Adult/Minor/Senior from giving User inputs

        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        String user_input = args[0]; //Passing the arguments in Edit Configurations
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        //Changing String to Int
        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String res = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(res);

        // OR
        // int age=25;
        // String res=(age<18) ? "Minor" : (age<65) ? "Adult" : "Senior citizen";
        // System.out.println(res);
    }
}
