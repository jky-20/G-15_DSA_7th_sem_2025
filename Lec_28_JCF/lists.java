package Lec_28_JCF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lists {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(20);

        for(int val : list){
            System.out.print(val + " ");
        }

        
        List<Integer> list2 = new ArrayList<>();

        list2.addAll(list);

        list.remove(1);

        // Stack

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();    // removes and returns top element
        stack.peek();   // return top element

        while(stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
