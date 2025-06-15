package ex_23_OOps_Super_Abstraction;

public class Lab121_Interface {
    public static void main(String[] args) {

        Nithya d = new Menon(); // Dynamic Dispatch will Interface
        Menon d1 = new Menon(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}

class Menon implements Nithya{


    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Nithya{
    int a = 10;
    void display();
}
