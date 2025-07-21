package Lec_16_Backtracking;

public class rat_in_maze {
    static boolean ratInMaze(int i, int j, int row, int col, int[][] maze){
        // Base Cases
        if (i >= row || j >= col || maze[i][j] == 1) {
            return false;
        }

        // Target case
        if (i == row-1 && j == col-1) {
            return true;
        }

        // memory ans
        // if(dp[i][j])

        // Recursive calls
        boolean right = ratInMaze(i, j+1, row, col, maze);
        boolean bottom = ratInMaze(i+1, j, row, col, maze);

        // operations to perform
        boolean ans = right | bottom;
        // return statement
        return ans;
    }

    // count valid paths from (0,0) to (row-1, col-1) in the maze
    static int countPaths(int i, int j, int row, int col, int[][] maze, int[][] dp){
        // Base Cases
        if (i >= row || j >= col || maze[i][j] == 1) {
            return 0;
        }

        // Target case
        if (i == row-1 && j == col-1) {
            return 1;
        }

        // memory ans
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        // Recursive calls
        int right = countPaths(i, j+1, row, col, maze, dp);
        int bottom = countPaths(i+1, j, row, col, maze, dp);

        // operations to perform
        int ans = right + bottom;
        dp[i][j] = ans;
        
        // return statement
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
