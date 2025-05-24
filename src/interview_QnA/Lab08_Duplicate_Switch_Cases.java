package interview_QnA;

public class Lab08_Duplicate_Switch_Cases {
    public static void main(String[] args) {

        //In switch condition duplicate cases are not allowed
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
            //case 98:
                //System.out.println("98");
        }
    }
}
