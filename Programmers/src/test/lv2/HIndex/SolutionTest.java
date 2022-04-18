package test.lv2.HIndex;

import main.lv2.HIndex.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertEquals(3, sol.solution(new int[]{3,0,6,1,5}));
    }
}
