package ex_30_Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab181_Map_P1 {
    public static void main(String[] args) {

        // Map m1 = new Map();

        // You can also add keys as any other data type.
        //m1.put("name","siri");
        // m1.put("rollno","siri");
        // m1.put(true,"siri");
        // m1.put(3.14,"siri");

        Map m1 = new HashMap();

        // Map is key - value
        // name : siri,
        // rollno : 1
        // phone : 9876543210

        //  PUT - put the key with the value into the map
        m1.put("name", "siri");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","siri");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();
        // Map is key - value
        // name : siri,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","siri");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
    }
}
