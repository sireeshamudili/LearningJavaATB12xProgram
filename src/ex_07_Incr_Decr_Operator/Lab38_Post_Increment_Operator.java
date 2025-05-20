package ex_07_Incr_Decr_Operator;

public class Lab38_Post_Increment_Operator {
    public static void main(String[] args) {

     // POST increment  = Print first and then increase
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

     // ERT ( Exp and Result Table)
     //   LNo |  a_post | b
     //   11  |  10 | NA
     //   12  |  11  | 10
     //   13  |  11  | NA
     //   14  | NA  | 10

        int a1_post = 10;
        System.out.println(a1_post++);
        System.out.println(a1_post);
    }
}
