package test.dp.CombinationSum2;

import main.dp.CombinationSum2.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void givenInteger_whenOneOrTwoStepsPerMove_thenFindAllPaths() {
        Assertions.assertAll(
                () -> test(List.of(List.of(1,1,6), List.of(1,2,5), List.of(1,7), List.of(2,6)), new int[]{10,1,2,7,6,1,5}, 8),
                () -> test(List.of(List.of(1,2,2), List.of(5)), new int[]{2,5,2,1,2}, 5)
        );
    }

    private void test(List<List<Integer>> expect, int[] candidates, int target) {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.combinationSum2(candidates, target);
        Assertions.assertEquals(expect, actual);
    }
}
