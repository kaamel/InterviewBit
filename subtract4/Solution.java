package subtract4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode subtract(ListNode A) {
        List<Integer> list = new ArrayList<>();
        int size = 0;

        ListNode next = A;
        while (next != null) {
            list.add(next.val);
            next = next.next;
            size++;
        }

        int n = size/2;

        if (n == 0)
            return A;

        if (n == 1) {
            ListNode result = new ListNode(list.get(size - 1) - list.get(0));
            result.next = A.next;
            return result ;
        }

        ListNode first = new ListNode(0);
        ListNode last;
        next = new ListNode(list.get(size-1) - list.get(0));
        first = next;
        ListNode rest = A.next;
        for (int i = 1; i< n; i++) {
            last = new ListNode(list.get(size-1-i) - list.get(i));
            next.next = last;
            next = last;
            rest = rest.next;
        }
        next.next = rest;
        return first;
    }
}
