package Lec_16_July_21_Backtracking;

public class fibonacci {
    static int fibonacci(int n, int[] dp){
        if(n == 0){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int track1 = fibonacci(n-1, dp);
        int track2 = fibonacci(n-2, dp);
        dp[n] = track1 + track2;

        return dp[n];
    }

    public static void main(String[] args) {
        
    }
}
