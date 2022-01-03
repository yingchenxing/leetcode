package week1.q2;

public class Solution {
    //    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        long num = getNum(l1) + getNum(l2);
//        if (num != 0)
//            return newNode(num);
//        else
//            return new ListNode(0);
//    }
    boolean flag = false;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            if (flag)
                return new ListNode(1);
            else
                return null;
        }

        if (l1 == null || l2 == null) {
            ListNode l = null;
            if (l1 == null) {
                l = l2;
            } else if (l2 == null) {
                l = l1;
            }

            if (flag ) {
                l.val++;
                if (l.val >= 10) {
                    l.val -= 10;
                    flag = true;
                    if (l.next != null)
                        l.next = addTwoNumbers(l.next, null);
                    else
                        l.next = new ListNode(1);
                } else
                    flag = false;
            }

            return l;
        }


        int val = l1.val + l2.val;
        if (flag) {
            val++;
        }
        if (val >= 10) {
            flag = true;
            val = val - 10;
        } else {
            flag = false;
        }

        ListNode listNode = new ListNode(val);
        listNode.next = addTwoNumbers(l1.next, l2.next);
        return listNode;
    }

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

    private long getNum(ListNode root) {
        if (root.next != null) {
            return (long) root.val + getNum(root.next) * 10;
        } else {
            return root.val;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = solution.newNode(81);
        ListNode l2 = new ListNode(0);
        System.out.println(solution.getNum(solution.addTwoNumbers(l1,l2)));
    }

}
