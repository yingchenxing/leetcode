package week1.q24;

import week1.q21.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        else if(head.next==null)
            return head;
        else{
            ListNode listNode = head.next;
            head.next = swapPairs(listNode.next);
            listNode.next = head;
            return listNode;
        }
    }
}