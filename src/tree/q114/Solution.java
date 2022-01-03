package tree.q114;

import tree.TreeNode;

class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode r = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode temp = root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right = r;
    }
}