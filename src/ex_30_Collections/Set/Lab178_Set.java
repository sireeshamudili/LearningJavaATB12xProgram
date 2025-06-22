package ex_30_Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab178_Set {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Siri");
        hs.add("Siri");
        hs.add("siri");
        hs.add("psiri");
        System.out.println(hs);
    }
}
