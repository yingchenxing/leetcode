package week6.q142;

import week1.q2.ListNode;

import java.util.Arrays;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null||fast.next ==null)
            return null;

        fast = head;
        while(slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
    }
}
