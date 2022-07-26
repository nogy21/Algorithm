package test.dp.LongestIncreasingSubsequence;

import main.dp.LongestIncreasingSubsequence.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenInteger_whenOneOrTwoStepsPerMove_thenFindAllPaths() {
        Assertions.assertAll(
                () -> test(4, new int[]{10,9,2,5,3,7,101,18}),
                () -> test(4, new int[]{0,1,0,3,2,3}),
                () -> test(1, new int[]{7,7,7,7,7,7,7})
        );
    }

    private void test(int expect, int[] nums) {
        Solution sol = new Solution();
        int actual = sol.lengthOfLIS(nums);
        Assertions.assertEquals(expect, actual);
    }
}
