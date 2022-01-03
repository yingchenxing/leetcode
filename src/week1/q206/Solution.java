package week1.q206;

import week1.q21.ListNode;

public class Solution {
//    public ListNode reverseList(ListNode head) {
//        Deque<ListNode> list = new LinkedList<>();
//        while (head != null) {
//            list.add(head);
//            head = head.next;
//        }
//        ListNode ans = new ListNode(0);
//        ListNode temp = ans;
//        while (!list.isEmpty()) {
//            temp.next = list.pollLast();
//            temp = temp.next;
//        }
//        temp.next=null;
//        return ans.next;
//    }
//
    private ListNode newNode(long num) {
        if (num != 0) {
            int i = (int) (num % 10);
            ListNode listNode = new ListNode(i);
            num = (num - i) / 10;
            listNode.next = newNode(num);
            return listNode;
        } else {
            return null;
        }
    }
//
//    private long getNum(ListNode root) {
//        if (root.next != null) {
//            return (long) root.val + getNum(root.next) * 10;
//        } else {
//            return root.val;
//        }
//    }

    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode temp;
        ListNode left = head;
        ListNode right = head.next;
        head.next=null;
        while(right!=null){
            temp = right.next;
            right.next = left;
            left = right;
            right = temp;
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l = solution.newNode(12345);
        l = solution.reverseList(l);
    }
}
