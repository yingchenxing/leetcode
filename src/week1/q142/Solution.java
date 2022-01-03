package week1.q142;

import week1.q21.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode s = head, d = head;
        List<ListNode> list = new ArrayList<>();
        while (d.next != null) {
            list.add(d);
            s = s.next;
            d = d.next.next;
            if (d == null || s == null)
                return null;
            if (d == s)
                return s;
        }
        return null;
    }
}
