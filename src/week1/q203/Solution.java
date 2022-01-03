package week1.q203;

import week1.q21.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        else if (head.val == val)
            return removeElements(head.next, val);
        else {
            head.next = removeElements(head.next,val);
            return head;
        }
    }
}