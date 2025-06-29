package ex_30_Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab187_Map_Within_Arraylist {
    public static void main(String[] args) {

        HashMap<String,String> student1 = new HashMap();
        student1.put("name","siri");
        student1.put("roll","1");
        student1.put("phone","96543210");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap();
        student2.put("name","nithya");
        student2.put("roll","2");
        student2.put("phone","65432356");
        System.out.println(student2);


        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        // List of Map
        // [{phone=96543210, name=siri, roll=1}, {phone=65432356, name=nithya, roll=2}]

        // JSON
        // [{"phone":96543210, "name":siri, "roll":1}, {"phone":65432356, "name":nithya, "roll":2}]
    }
}
