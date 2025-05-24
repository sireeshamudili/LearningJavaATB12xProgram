package ex_10_For_loop;

public class Lab56_For_Loop_Using_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            //System.out.println(i); //0,1,2,3,4,5
            if (i == 5) {
                break;
                //System.out.println(i); // Not possible statement
            }
           System.out.println(i); //0,1,2,3,4
        }
    }
}
