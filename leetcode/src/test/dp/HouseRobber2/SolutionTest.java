package test.dp.HouseRobber2;

import main.dp.HouseRobber2.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenIntegerArray_whenNotAllowTwoAdjacentNums_thenFindMaxSum() {
        Assertions.assertAll(
                () -> test(3, new int[]{2,3,2}),
                () -> test(4, new int[]{1,2,3,1}),
                () -> test(3, new int[]{1,2,3})
        );
    }

    private void test(int expect, int[] nums) {
        Solution sol = new Solution();
        int actual = sol.rob(nums);
        Assertions.assertEquals(expect, actual);
    }
}
