package tree.q144;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null)
            list.add(root.val);
        else
            return null;
        if (root.left != null)
            list.addAll(preorderTraversal(root.left));
        if (root.right != null)
            list.addAll(preorderTraversal(root.right));
        return list;
    }
}
