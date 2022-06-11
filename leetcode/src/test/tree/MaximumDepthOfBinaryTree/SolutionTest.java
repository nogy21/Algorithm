package test.tree.MaximumDepthOfBinaryTree;

import main.tree.MaximumDepthOfBinaryTree.Solution;
import main.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void givenTreeNode_thenFindMaximumDepth() {
        assertAll(
                () -> test(3, TreeNode.newTree(3,9,20,null,null,15,7)),
                () -> test(2, TreeNode.newTree(1,null,2))
        );
    }

    private void test(int expect, TreeNode given) {
        Solution sol = new Solution();
        int actual = sol.maxDepth(given);
        assertEquals(expect, actual);

        actual = sol.maxDepth2(given);
        assertEquals(expect, actual);
    }
}
