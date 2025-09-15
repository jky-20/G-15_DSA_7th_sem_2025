package Lec_32_August_18_Stack;

import java.util.Stack;

public class next_greater_element {
    static int[] nextGreaterElement(int[] arr){

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i=0 ; i < arr.length ; i++){
            int curr = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] < curr){
                ans[stack.pop()] = curr;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
