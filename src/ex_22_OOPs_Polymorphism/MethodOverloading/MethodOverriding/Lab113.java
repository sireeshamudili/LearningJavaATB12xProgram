package ex_22_OOPs_Polymorphism.MethodOverloading.MethodOverriding;

public class Lab113 {
    public static void main(String[] args) {

        Siri s = new Siri();
        s.home();
        s.p1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Siri();
        f2.home();
    }
}
