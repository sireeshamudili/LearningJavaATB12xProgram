package ex_08_If_else_Condition;

public class Lab42_If_Cond {
    public static void main(String[] args) {

        //If condition
        int age= 17;
        if(age > 18)
        {
            System.out.println("Yes you are allowed to vote!");
        }

        //If-else condition
        int age1 = 25;
        if(age > 18)
        {
            System.out.println("You can vote!");
        }
        else
        {
            System.out.println("You can't vote!");
        }

        //If-else condition by user arguments
        int age2 = Integer.parseInt(args[0]);
        if (age > 25)
        {
            System.out.println("Yes you can go to Paris!");
        }else
        {
            System.out.println("You can't Go to Paris!");
        }
    }
}
