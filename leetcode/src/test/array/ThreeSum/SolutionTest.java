package array.ThreeSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void solution () {
        Solution sol = new Solution();

        List<List<Integer>> answer = Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1));
        Assertions.assertEquals(answer, sol.threeSum(new int[]{-1,0,1,2,-1,-4}));

        answer = Arrays.asList();
        Assertions.assertEquals(answer, sol.threeSum(new int[]{}));

        answer = Arrays.asList();
        Assertions.assertEquals(answer, sol.threeSum(new int[]{0}));
    }
}
