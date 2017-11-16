package subtract4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode a = new ListNode(95);
        ListNode b = new ListNode(59);
        ListNode c = new ListNode(26);
        ListNode d = new ListNode(16);
        ListNode e = new ListNode(39);
        ListNode f = new ListNode(29);
        ListNode g = new ListNode(8);
        ListNode h = new ListNode(74);
        ListNode z = new ListNode(14);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = z;
        z.next = null;

        ListNode node = solution.subtract(a);
        System.out.println(node.val);
        while (node.next != null) {
            System.out.println(node.next.val);
            node = node.next;
        }
    }
}
