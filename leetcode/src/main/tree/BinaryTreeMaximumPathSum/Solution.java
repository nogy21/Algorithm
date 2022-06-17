package main.tree.BinaryTreeMaximumPathSum;

import main.tree.TreeNode;

/**
 * 124. Binary Tree Maximum Path Sum
 * : A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
 *  A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 *  The path sum of a path is the sum of the node's values in the path.
 *  Given the root of a binary tree, return the maximum path sum of any non-empty path.
 */
public class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        findMaxPathSum(root);
        return max;
    }

    private int findMaxPathSum(TreeNode root) {
        if (root == null) return 0;

        // left, right subtree 순회
        int left = Math.max(findMaxPathSum(root.left), 0);
        int right = Math.max(findMaxPathSum(root.right), 0);

        // max 갱신
        max = Math.max(max, root.val + left + right);

        // root -> left -> root -> right -> root 순으로 순회하기 때문에, root.val + left + right 를 반환하면 노드의 순회가 불가능
        return root.val + Math.max(left, right);
    }
}
