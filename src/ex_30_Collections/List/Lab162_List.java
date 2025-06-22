package ex_30_Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Lab162_List {
    public static void main(String[] args) {

        List fruits = List.of("orange","apple","guava","mango","watermelon");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("siri");
        arrayList.add(null);
        arrayList.add("rakhi");
        arrayList.add("rakhi"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
