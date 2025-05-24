package exercises;

public class Task_04 {
    public static void main(String[] args) {

        //#1
        int i = 11;
        i = i++ + ++i;

        System.out.println(i);

        //i++ = 12
        //+
        //++i = 12

        //#2
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        //a = 11, a++ = 12, ++a = 13
        //b = 22, b++ = 23, ++b =24
        //c = 11+22+12+23+12+23

        //#3
        int j = 1, k = 2, l= 3;

        int m = j-- - k-- - l--;

        System.out.println("j=" + j + ", k=" + k + ", l=" + l + ", m=" + m);

        //After decrement the values are
        //j =0
        //k = 1
        //l =2
        //m=-4(1-2-3) => (The post decrement uses the original values(1, 2, 3) in the exp then decrements(0, 1, 2)
    }
}

