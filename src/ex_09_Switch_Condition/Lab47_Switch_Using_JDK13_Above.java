package ex_09_Switch_Condition;

public class Lab47_Switch_Using_JDK13_Above {
    public static void main(String[] args) {

        // In JDK > 13 = We can use "->" instead of break word.

        int itemCode = 1;
        switch (itemCode){
            case 1 -> System.out.println("001");
            case 2 -> System.out.println("002");
            case 3 -> System.out.println("003");
            default -> System.out.println("Default");
        }

        // JDK > 13 = We can use case numbers more than one(1,2,3)

        int itemcode = 6;
        switch (itemcode){
            case 1,2,3:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 4,6,7:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
