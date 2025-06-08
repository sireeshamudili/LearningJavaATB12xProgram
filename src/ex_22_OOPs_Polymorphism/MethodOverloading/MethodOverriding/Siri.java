package ex_22_OOPs_Polymorphism.MethodOverloading.MethodOverriding;

public class Siri extends Father {
    void p1() {
        System.out.println("pramod - p1");
    }

    @Override
    void home() {
        System.out.println("pramod - 3BHK");
    }
}