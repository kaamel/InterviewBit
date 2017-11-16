package prettyprint2;

public class Solution {
    public int[][] prettyPrint(int A) {
        return solve(A);
    }


    int[][] solve(int n) {
        int[][] r = new int[2*n-1][2*n-1];
        if (n == 1) {
            r[0][0] = 1;
        }
        else {
            int[][] b = solve(n - 1);
            for (int row = 0; row < 2 * n - 1; row++) {
                for (int column = 0; column < 2 * n - 1; column++) {
                    if (row == 0 || column == 0 || row == 2 * n - 2 || column == 2 * n - 2) {
                        r[row][column] = n;
                    } else {
                        r[row][column] = b[row - 1][column - 1];
                    }
                }
            }
        }
        return r;
    }
}
