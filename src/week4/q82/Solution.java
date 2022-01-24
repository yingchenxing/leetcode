package week4.q82;

import week1.q2.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        if (head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);
            return head;
        }

        ListNode temp = head;
        while (temp.next != null && temp.val == temp.next.val)
            temp = temp.next;
        if (temp.next != null)
            temp = temp.next;
        return  deleteDuplicates(temp);
    }
}
