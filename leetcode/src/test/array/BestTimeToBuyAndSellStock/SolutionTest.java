package test.array.BestTimeToBuyAndSellStock;

import main.array.BestTimeToBuyAndSellStock.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertEquals(5, sol.maxProfit(new int[]{7,1,5,3,6,4})),
                () -> Assertions.assertEquals(0, sol.maxProfit(new int[]{7,6,4,3,1}))
        );
    }
}
