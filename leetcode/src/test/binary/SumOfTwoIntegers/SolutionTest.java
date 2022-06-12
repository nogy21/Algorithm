package test.binary.SumOfTwoIntegers;

import main.binary.SumOfTwoIntegers.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenTwoIntegers_whenSum_thenNotUsingPlusAndMinus() {
        Assertions.assertAll(
                () -> test(3, new int[]{1, 2}),
                () -> test(5, new int[]{2, 3})
        );
    }

    public void test(int expect, int[] given) {
        Solution sol = new Solution();
        int actual = sol.getSum(given[0], given[1]);
        Assertions.assertEquals(expect, actual);
    }
}
