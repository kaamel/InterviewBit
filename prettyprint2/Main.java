package prettyprint2;

public class Main {
    public static void main(String[] args) {

        //test case
        int A = 7;
        ///////////

        Solution solution = new Solution();
        int[][] b = solution.solve(A);

        for (int i = 0; i< 2*A -1; i++) {
            for (int j = 0; j < 2 * A - 1; j++) {
                System.out.print("" + b[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
