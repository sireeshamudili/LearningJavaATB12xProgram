package ex_30_Collections.List;

import java.util.Stack;

public class Lab172_Stack {
    public static void main(String[] args) {

        // Stack
        // List In and First Out

        // Stack s = new Stack();
        // s.add("Siri");
        // s.add("Nithya");
        // s.add("Rakhi");

        Stack s = new Stack();
        s.push("Siri");
        s.push("Nithya");
        s.push("Prabha");
        s.push("Rakhi");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Pavan");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
