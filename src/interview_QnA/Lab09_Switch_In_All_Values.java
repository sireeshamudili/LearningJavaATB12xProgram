package interview_QnA;

public class Lab09_Switch_In_All_Values {
    public static void main(String[] args) {

        //In switch condition we can give all values(Positive, Negative)
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
