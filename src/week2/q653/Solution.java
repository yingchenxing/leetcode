package week2.q653;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public TreeNode root;
//    List<Integer> list;
//
//    public boolean findTarget(TreeNode root, int k) {
//        list = new ArrayList<>();
//        addNode(root);
//        if(list.size()<2)
//            return false;
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i :list){
//            if(map.containsKey(k-i))
//                return true;
//            else
//                map.put(i,0);
//        }
//        return false;
//    }
//
//    public void addNode(TreeNode root){
//        if(root==null)
//            return;
//        addNode(root.left);
//        list.add(root.val);
//        addNode(root.right);
//    }

    public boolean findTarget(TreeNode root, int k) {
        if (root == null || (root.right == null && root.left == null))
            return false;
        this.root = root;
        return search(root, k);
    }

    public boolean search(TreeNode root, int k) {
        if (root == null)
            return false;
        int temp = k - root.val;
        TreeNode t = this.root;
        while (t != null) {
            if (temp == t.val)
                return true;
            else if (temp < t.val)
                t = t.left;
            else
                t = t.right;
        }
        return search(root.left, k) ||
                search(root.right, k);
    }
}
