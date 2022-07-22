package test.dp.CoinChange;

import main.dp.CoinChange.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenInteger_whenOneOrTwoStepsPerMove_thenFindAllPaths() {
        Assertions.assertAll(
                () -> test(3, new int[]{1,2,5}, 11),
                () -> test(-1, new int[]{2}, 3),
                () -> test(0, new int[]{1}, 0)
        );
    }

    private void test(int expect, int[] coins, int amount) {
        Solution sol = new Solution();
        int actual = sol.coinChange(coins, amount);
        Assertions.assertEquals(expect, actual);
    }
}
