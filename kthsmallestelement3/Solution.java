package kthsmallestelement3;

import java.util.Arrays;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int[] a = A;
        Arrays.sort(a);
        return a[B-1];
    }
}
