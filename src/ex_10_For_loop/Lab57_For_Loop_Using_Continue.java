package ex_10_For_loop;

public class Lab57_For_Loop_Using_Continue {
    public static void main(String[] args) {

        //Continue => Skips the current iteration and continue with next lines
        for (int i = 0; i < 10 ; i++) {
            if(i ==5){
                continue;
            }
            System.out.println(i);
        }

        //In this continue keyword skips the current iteration means even numbers and print reverse
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }

        //Prints Even numbers and skips Odd numbers
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even -> " + i);
        }
    }
}
