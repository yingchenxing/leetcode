package tree.q108;

import com.sun.source.tree.Tree;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0, nums.length-1);
    }

    public TreeNode dfs(int[] nums,int left,int right)
    {
        if(nums.length==0)
            return null;
        else if(left>right)
            return null;
        else
        {
            int middle = (left+right)/2;
            TreeNode l = dfs(nums,left,middle-1);
            TreeNode r = dfs(nums,middle+1,right);
            return new TreeNode(nums[middle],l,r);
        }

    }

    public static void main(String[] args) {
        System.out.println((1+2)/2);
    }
}
