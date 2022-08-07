package dp.UniquePaths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenGraph_whenCanMoveRightAndDown_thenFindMaxPathSum() {
        Assertions.assertAll(
                () -> test(28, 3, 7),
                () -> test(3, 3, 2)
        );
    }

    private void test(int expect, int m, int n) {
        Solution sol = new Solution();
        int actual = sol.uniquePaths(m, n);
        Assertions.assertEquals(expect, actual);
    }
}
