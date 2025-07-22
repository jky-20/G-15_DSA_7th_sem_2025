package Lec_17_July_22_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class print_all_subsets {
    static void printSubsets(int[] arr, int i, List<Integer> subset){
        
        // base case
        if(i == arr.length){

            for(int val : subset){
                System.out.print(val + "  ");
            }
            System.out.println();
            return;
        }

        // operations

        // recursive calls
        printSubsets(arr, i+1, subset);

        // operations
        subset.add(arr[i]);

        // recursive call
        printSubsets(arr, i+1, subset);

        // operation
        subset.removeLast();

        // return statement
    }
    public static void main(String[] args) {
        

        int[] arr = new int[]{1, 2, 8, 5, 3};

        printSubsets(arr, 0, new ArrayList<>());
    }
}
