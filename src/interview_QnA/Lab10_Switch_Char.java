package interview_QnA;

public class Lab10_Switch_Char {
    public static void main(String[] args) {

        //In this both cases A and B are not valid.....default will execute
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }

    }
}
