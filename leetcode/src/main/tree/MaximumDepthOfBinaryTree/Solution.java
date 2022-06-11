package main.tree.MaximumDepthOfBinaryTree;

import main.tree.TreeNode;

public class Solution {
    /**
     * my solution
     */
    public int maxDepth(TreeNode root) {
        TreeNode dummy = root;
        return findMaxDepth(0, 0, dummy);
    }

    private int findMaxDepth(int depth, int max, TreeNode dummy) {
        if (dummy == null) {
            return Math.max(depth, max);
        }
        return Math.max(findMaxDepth(depth + 1, max, dummy.left),findMaxDepth(depth + 1, max, dummy.right));
    }

    /**
     * Most voted
     */
    public int maxDepth2(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
