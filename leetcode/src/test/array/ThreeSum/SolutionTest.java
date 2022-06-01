package array.ThreeSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void solution () {
        Solution sol = new Solution();

        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list = Arrays.asList(-1,-1,2);
        answer.add(list);
        list = Arrays.asList(-1,0,1);
        answer.add(list);

        Assertions.assertEquals(answer, sol.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
