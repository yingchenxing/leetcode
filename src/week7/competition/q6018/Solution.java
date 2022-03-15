package week7.competition.q6018;

import tree.TreeNode;

import java.util.*;

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] arr : descriptions) {
            int parent = arr[0],  isLeft = arr[2], child = arr[1];
            TreeNode node = map.getOrDefault(parent,new TreeNode(parent));
            TreeNode cNode = map.getOrDefault(child,new TreeNode(child));
            if(isLeft==1){
                node.left = cNode;
            }else
                node.right = cNode;
            map.put(parent,node);
            map.put(child,cNode);
            children.add(child);
        }

        for(int[] arr:descriptions){
            if(!children.contains(arr[0]))
                return map.get(arr[0]);
        }
        return null;
    }


}