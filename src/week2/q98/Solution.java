package week2.q98;

import tree.TreeNode;

class Solution {
    public long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        if(!isValidBST(root.left))
            return false;
        if(pre>root.val)
            return false;
        pre = root.val;
        return isValidBST(root.right);
    }
}