package week1.q141;

import week1.q21.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode s = head, d = head;
        while (d.next != null) {
            s = s.next;
            d = d.next.next;
            if (d == null || s == null)
                return false;
            if (d==s)
                return true;
        }
        return false;
    }
}
