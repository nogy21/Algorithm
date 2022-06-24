package test.dp.ClimbingStairs;

import main.dp.ClimbingStairs.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenInteger_whenOneOrTwoStepsPerMove_thenFindAllPaths() {
        Assertions.assertAll(
                () -> test(2, 2),
                () -> test(3, 3)
        );
    }

    private void test(int expect, int n) {
        Solution sol = new Solution();
        int actual = sol.climbStairs(n);
        Assertions.assertEquals(expect, actual);
    }
}
