package test.tree.BinaryTreeMaximumPathSum;

import main.tree.BinaryTreeMaximumPathSum.Solution;
import main.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *  Example 1:
 *  Input: root = [1,2,3]
 *  Output: 6
 *  Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 *
 *  Example 2:
 *  Input: root = [-10,9,20,null,null,15,7]
 *  Output: 42
 *  Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 */
public class SolutionTest {
    @Test
    public void givenTreeNode_whenTraverse_FindMaxPathSum() {
        Assertions.assertAll(
                () -> test(0, TreeNode.newTree()),
                () -> test(1, TreeNode.newTree(1)),
                () -> test(3, TreeNode.newTree(1,2)),
                () -> test(6, TreeNode.newTree(1,2,3)),
                () -> test(42, TreeNode.newTree(-10,9,20,null,null,15,7))
        );
    }

    private void test(int expect, TreeNode given) {
        Solution sol = new Solution();
        int actual = sol.maxPathSum(given);
        Assertions.assertEquals(expect, actual);
    }

}
