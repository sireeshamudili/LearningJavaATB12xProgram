package ex_30_Collections.List;

import java.util.Vector;

public class Lab164_Vector {
    public static void main(String[] args) {

        Vector v = new Vector(); // Array

        v.add("Siri");
        v.add("Nithya");
        v.add("Prabha");
        System.out.println(v);
        v.remove("Rakhi");
        System.out.println(v);
        System.out.println(v.contains("Siri"));
    }
}
