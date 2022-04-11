package test.lv1.K번째수;

import main.lv1.K번째수.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertArrayEquals(new int[]{5,6,3}, sol.solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3}, {4,4,1}, {1,7,3}}));
    }

}
