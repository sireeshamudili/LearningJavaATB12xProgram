package ex_07_Incr_Decr_Operator;

public class Lab39_Advanced_InD_Operators {
    public static void main(String[] args) {

        //Ex1:
        int a = 10;
        System.out.println(a++ + a);
        // A+B
        // A -> a++ -> ExpA -> 10 , a -> 11
        // +
        // B -> a -> ExpB -> 11

        // ERT
        // LNo |  a | Exp
        // 5   | 10  | NA
        // 6   | -  | 10+11 ->  21

        //Ex2:
        int a1 = 10;
        System.out.println(a++ + ++a);
        System.out.println(a1);

        // a++ -> ExpA ->  10 , a -> 11
        // +
        // ++a -> ExpB ->  12 , a -> 12

        //Ex3:
        int a2 = 10;
        System.out.println(++a + ++a);
        System.out.println(a2);

        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA+ExpB -> 11+12 -> 23, a -> 12

    }
}
