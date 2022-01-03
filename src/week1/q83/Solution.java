package week1.q83;

import week1.q21.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        int[] count = new int[201];
        ListNode ip = null;
        ListNode ip_ = head;//维护IP前一个链表
        while (ip != null) {
            if (count[ip.val + 100] >= 1) {
                ip_.next = ip.next;
            }else{
                count[ip.val + 100]++;
                ip_ = ip;
            }

            ip = ip.next;
        }
        return head;
    }
}
