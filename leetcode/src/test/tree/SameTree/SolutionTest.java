package test.tree.SameTree;

import main.tree.SameTree.Solution;
import main.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void givenTwoTreeNodes_thenCompareSameOrNot() {
        assertAll(
                () -> test(true, TreeNode.newTree(1,2,3), TreeNode.newTree(1,2,3)),
                () -> test(false, TreeNode.newTree(1,2), TreeNode.newTree(1,null,2)),
                () -> test(false, TreeNode.newTree(1,2,1), TreeNode.newTree(1,1,2))
        );
    }

    private void test(boolean expect, TreeNode p, TreeNode q) {
        Solution sol = new Solution();
        boolean actual = sol.isSameTree(p, q);
        assertEquals(expect, actual);
    }
}
