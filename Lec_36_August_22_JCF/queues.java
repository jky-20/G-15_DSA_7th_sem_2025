package Lec_36_August_22_JCF;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class queues {
    public static void main(String[] args) {
        
        LinkedList<Integer> listQue = new LinkedList<>();
        ArrayDeque<Integer> arrayQue = new ArrayDeque<>();

        // use as queue
        listQue.offer(10);
        listQue.add(20);
        listQue.poll();
        listQue.peek();

        // use as stack
        arrayQue.push(10);
        arrayQue.pop();
        arrayQue.peek();
        listQue.push(10);

        // double ended queue    
        arrayQue.addFirst(10);
        arrayQue.addLast(20);
        listQue.addFirst(20);
        listQue.addLast(12);
    }
}
