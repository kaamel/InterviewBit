package alluniquepermutations5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    int[][] permute(int[] A) {
        List<List<Integer>> listOfPerms = new ArrayList<>();
        listOfPerms.add(new ArrayList<>());
        for (int a : A) {
            Set<List<Integer>> set = new HashSet<>();
            for (List<Integer> perm : listOfPerms) {
                int lSize = perm.size();
                for (int j = 0; j <= lSize; j++) {
                    perm.add(j, a);
                    List<Integer> permlist = new ArrayList<>(perm);
                    perm.remove(j);
                    set.add(permlist);
                }
            }
            listOfPerms = new ArrayList<>(set);
        }
        int[][] result = new int[listOfPerms.size()][A.length];
        int i = 0;
        for (List<Integer> perm: listOfPerms) {
            for (int j=0; j< A.length; j++)
                result[i][j] = perm.get(j);

            i++;
        }
        return result;
    }
}
