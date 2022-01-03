package week2.q101;

import tree.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
            return true;
        else if(root.left==null||root.right==null)
            return false;

        return isSymmetric(root.right,root.left);
    }

    public boolean isSymmetric(TreeNode l,TreeNode r){
        if(l==null&&r==null)
            return true;
        else if(l==null||r==null)
            return false;
        if(l.val!=r.val)
            return false;
        return isSymmetric(l.left,r.right)&&isSymmetric(l.right,r.left);
    }
}
