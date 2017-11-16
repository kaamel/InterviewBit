package kthsmallestelement3;

public class Main {
    public static void main(String[] args) {

        //enter test cases here
        int[] A = {2, 2, 2, 2};
        int B = 2;
        ///////////////////////

        Solution solution = new Solution();
        if (B == 1)
            System.out.println("The smallest element is " + solution.kthsmallest(A, B));
        else if (B == 2)
            System.out.println("The second smallest element is " + solution.kthsmallest(A, B));
        else if (B == 3)
            System.out.println("The third smallest element is " + solution.kthsmallest(A, B));
        else {
            if (B == 1)
                System.out.println("The " + B + "th" +"smallest element is " + solution.kthsmallest(A, B));
        }
    }
}
