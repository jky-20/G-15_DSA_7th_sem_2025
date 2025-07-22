package Lec_17_July_22_Backtracking;

public class subset_sum_to_K {
    static boolean printSubsets(int[] arr, int i, int subsetSum, int k){
        
        // base case
        if(i == arr.length){

            if(subsetSum == k){
                return true;
            }
            return false;
        }

        // operations

        // recursive calls
        boolean ans = printSubsets(arr, i+1, subsetSum, k);
        if(ans == true){
            return true;
        }
        // operations

        // recursive call
        return printSubsets(arr, i+1, subsetSum + arr[i], k);

        // operation

        // return statement
    }
    public static void main(String[] args) {
        
    }
}
