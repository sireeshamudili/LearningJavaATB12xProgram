package ex_12_Do_While_Loop;

public class Lab65_Do_While {
    public static void main(String[] args) {

        //do-while loop (Executes atleast one time if the while condition false)
        //Ex1:
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 10); //Both do and while loops executes as while condition is true

        //Ex2:
        int i = 1;
        do{
            System.out.println("The value is: "+i); //Executes this statement, cuz do loop executes atleast once
        }
        while(i > 10); //The while condition is false
    }
}
