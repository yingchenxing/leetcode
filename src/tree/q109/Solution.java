package tree.q109;

import week1.q21.ListNode;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Integer[] nums = list.toArray(new Integer[0]);
        return dfs(nums,0, nums.length);
    }

    public TreeNode dfs(Integer[] nums, int left, int right) {
        if (nums.length == 0)
            return null;
        else if (left > right)
            return null;
        else {
            int middle = (left + right) / 2;
            TreeNode l = dfs(nums, left, middle - 1);
            TreeNode r = dfs(nums, middle + 1, right);
            return new TreeNode(nums[middle], l, r);
        }

    }

    public static void main(String[] args) {
        System.out.println((1 + 2) / 2);
    }
}
