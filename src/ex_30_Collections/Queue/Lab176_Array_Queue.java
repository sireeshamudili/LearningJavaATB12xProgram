package ex_30_Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab176_Array_Queue {
    public static void main(String[] args) {

        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);
    }
}
