package test.binary.MissingNumber;

import main.binary.MissingNumber.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    /**
     * Example 1:
     * Input: nums = [3,0,1]     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
     * 2 is the missing number in the range since it does not appear in nums.
     *
     * Example 2:
     * Input: nums = [0,1]     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
     * 2 is the missing number in the range since it does not appear in nums.
     *
     * Example 3:
     * Input: nums = [9,6,4,2,3,5,7,0,1]     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
     * 8 is the missing number in the range since it does not appear in nums.
     */
    @Test
    public void givenIntegerN_whenChangeToBinary_thenFindAllOnesInZeroToN() {
        assertAll(
                () -> test(2, new int[]{3, 0, 1}),
                () -> test(2, new int[]{0, 1}),
                () -> test(8, new int[]{9,6,4,2,3,5,7,0,1})
        );
    }

    private void test(int expect, int[] given) {
        Solution sol = new Solution();
        int actual = sol.missingNumber2(given);
        assertEquals(expect, actual);
    }
}
