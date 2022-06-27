package test.binary.CountingBits;

import main.binary.CountingBits.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    /**
     * Example 1:
     *  Input: n = 2
     *  Output: [0,1,1]
     *  Explanation:
     *  0 --> 0
     *  1 --> 1
     *  2 --> 10
     * Example 2:
     *  Input: n = 5
     *  Output: [0,1,1,2,1,2]
     *  Explanation:
     *  0 --> 0
     *  1 --> 1
     *  2 --> 10
     *  3 --> 11
     *  4 --> 100
     *  5 --> 101
     */
    @Test
    public void givenIntegerN_whenChangeToBinary_thenFindAllOnesInZeroToN() {
        Assertions.assertAll(
                () -> test(new int[]{0,1,1}, 2),
                () -> test(new int[]{0,1,1,2,1,2}, 5)
        );
    }

    private void test(int[] expect, int given) {
        Solution sol = new Solution();
        int[] actual = sol.countBits(given);
        Assertions.assertArrayEquals(expect, actual);
    }
}
