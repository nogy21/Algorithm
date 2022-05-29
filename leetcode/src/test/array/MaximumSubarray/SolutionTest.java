package test.array.MaximumSubarray;

import main.array.MaximumSubarray.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        assertAll(
                () -> assertEquals(6, sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})),
                () -> assertEquals(1, sol.maxSubArray(new int[]{1})),
                () -> assertEquals(23, sol.maxSubArray(new int[]{5,4,-1,7,8}))
        );
        assertAll(
                () -> assertEquals(6, sol.maxSubArrayFaster(new int[]{-2,1,-3,4,-1,2,1,-5,4})),
                () -> assertEquals(1, sol.maxSubArrayFaster(new int[]{1})),
                () -> assertEquals(23, sol.maxSubArrayFaster(new int[]{5,4,-1,7,8}))
        );
    }
}
