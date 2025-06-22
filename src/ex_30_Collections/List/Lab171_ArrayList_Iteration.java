package ex_30_Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab171_ArrayList_Iteration {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList();
        mylist.add("Siri");
        mylist.add("Pavan");
        mylist.add("Rakhi");


        System.out.println(" - To Print Arraylist - 1 ");

        for (String str : mylist) {
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" - To Print Arraylist - 3 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
