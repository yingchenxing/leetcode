package week1.offer06;

import week1.q21.ListNode;

class Solution {
    public int[] reversePrint(ListNode head) {
        if(head == null){
            int[] num = {};
        }
        else if(head.next==null)
        {
            int[] num = {head.val};
        }
        ListNode ip = head.next;
        ListNode ip_ = head;
        head.next=null;
        ListNode temp = head;
        int count = 2;
        while(ip.next!=null){
            temp = ip.next;
            ip.next = ip_;
            ip_ = ip;
            ip = temp;
            count++;
        }

        ip.next = ip_;
        int[] num = new int[count];
        for(int i = 0;i<count;i++){
            num[i] = ip.val;
            ip=ip.next;
        }

        return num;
    }
}
