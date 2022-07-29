package test.dp.CombinationSum;

import main.dp.CombinationSum.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void givenInteger_whenOneOrTwoStepsPerMove_thenFindAllPaths() {
        Assertions.assertAll(
                () -> test(List.of(List.of(2,2,3), List.of(7)), new int[]{2,3,6,7}, 7),
                () -> test(List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5)), new int[]{2,3,5}, 8),
                () -> test(List.of(), new int[]{2}, 1)
        );
    }

    private void test(List<List<Integer>> expect, int[] candidates, int target) {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSumWithDP(candidates, target);
        Assertions.assertEquals(expect, actual);
    }
}
