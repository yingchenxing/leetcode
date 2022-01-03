package week2.q102;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return null;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        num.add(root.val);
        ans.add(num);

        List<List<Integer>> l = levelOrder(root.left);
        List<List<Integer>> r = levelOrder(root.right);

        if (l == null && r == null) {
            return ans;
        } else if (l == null) {
            ans.addAll(r);
            return ans;
        } else if (r == null) {
            ans.addAll(l);
            return ans;
        }

        for (int i = 0; i < l.size() && i < r.size(); i++)
            l.get(i).addAll(r.get(i));

        if(l.size()<r.size()){
            for(int i = l.size();i<r.size();i++)
                l.add(r.get(i));
        }
        ans.addAll(l);
        return ans;
    }
}
