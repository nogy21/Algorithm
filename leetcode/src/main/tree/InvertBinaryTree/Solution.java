package main.tree.InvertBinaryTree;

import main.tree.TreeNode;

/**
 * 226. Invert Binary Tree
 * : Given the root of a binary tree, invert the tree, and return its root.
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode dummy = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(dummy);
        return root;
    }
}
