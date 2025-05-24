package interview_QnA;

public class Lab07_Switch_Condition {
    public static void main(String[] args) {

        int a = 10;
        switch (a){

        }

        //In switch case "char" is used because char is considered as "int"
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }

        //In switch case "boolean" is not applicable
        boolean b = true;
        // switch (b)
        // {
        // .........
        // }

        //In switch case "long" is applicable
        long a11 = 30l;
        switch ((int) a11) {
        }
    }
}
