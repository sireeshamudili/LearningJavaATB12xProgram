package ex_21_OOPs_Inheritance.SingleHeritance.MultilevelHeritance;

public class Lab110_ML {
    public static void main(String[] args) {

        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf =  new GrandFather();

        Son s1 = new Son();
        //Son s2 = new Father();
        Father f1 = new Son(); // Dynamic Dispatch.
        GrandFather gf1 = new Son();
        GrandFather gf2 = new Father();
        // Son s3 = new GrandFather();
    }
}
