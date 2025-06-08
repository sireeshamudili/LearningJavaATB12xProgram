package ex_21_OOPs_Inheritance.SingleHeritance;

public class Lab108_SI {
    public static void main(String[] args) {

        Son pramod = new Son();
        System.out.println(pramod.gold_f);
        pramod.bhk2();
        pramod.bhk3();

        Cousin c = new Cousin();
        // c.bhk3();
        // System.out.println(c.gold_f);
    }
}
