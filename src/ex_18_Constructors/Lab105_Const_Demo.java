package ex_18_Constructors;

public class Lab105_Const_Demo {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        Baby b2;
    }
}
       class Baby{
       String name;

       // Default Constructor also called
        Baby(){
        System.out.println("I am called, Object is created!");
    }
}
