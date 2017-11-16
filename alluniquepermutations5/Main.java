package alluniquepermutations5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1,1,2, 2};
        Arrays.sort(A);
        int[][] result = solution.permute(A);
        for (int[] row: result) {
            boolean start = true;
            for (int col : row) {
                if (start) {
                    System.out.print("[" + col);
                    start = false;
                }
                else
                    System.out.print(", " + col);
            }
            System.out.println("]");
        }
    }
}
