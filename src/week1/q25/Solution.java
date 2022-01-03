package week1.q25;

import week1.q21.ListNode;

class Solution {

//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode ans = new ListNode(0);
//        ListNode l ;
//        ListNode pointer = ans;
//        Deque<ListNode> list = new LinkedList<>();
//        while (true) {
//            l = head;
//            //判断是否有k个可以反转
//            int i = 0;
//            while (i < k && l != null) {
//                list.add(l);
//                l=l.next;
//                i++;
//            }
//
//            if (i!=k) {
//                pointer.next = head;
//                break;
//            }
//
//            while (!list.isEmpty()) {
//                pointer.next = list.pollLast();
//                pointer = pointer.next;
//            }pointer.next = l;
//            head = l;
//
//        }
//        return ans.next;
//    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int i = 0;
        ListNode pointer1 = head;
        while (i < k && pointer1 != null) {
            pointer1 = pointer1.next;
            i++;
        }

        if (i == k) {
            pointer1 = reverseKGroup(pointer1, k);

            while (i != 0) {
                i--;
                ListNode temp = head.next;
                head.next = pointer1;
                pointer1 = head;
                head = temp;
            }
            head = pointer1;
        }
        return head;
    }

//    public ListNode reverseK(ListNode head,int k){
//        if(k==1||k==0){
//            return head;
//        }
//        ListNode tail;
//        ListNode temp;
//        reverseK(head,k-2);
//
//        head.
//    }
}
