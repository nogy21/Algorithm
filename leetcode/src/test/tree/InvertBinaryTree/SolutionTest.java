package test.tree.InvertBinaryTree;

import main.tree.InvertBinaryTree.Solution;
import main.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenTreeNode_whenInvert_thenReturnRoot () {
        Assertions.assertAll(
                () -> test(TreeNode.newTree(4,7,2,9,6,3,1), TreeNode.newTree(4,2,7,1,3,6,9)),
                () -> test(TreeNode.newTree(2,3,1), TreeNode.newTree(2,1,3)),
                () -> test(TreeNode.newTree(), TreeNode.newTree())
        );
    }

    private void test(TreeNode expect, TreeNode given) {
        Solution sol = new Solution();
        TreeNode actual = sol.invertTree(given);
        Assertions.assertEquals(expect, actual);
    }
}
