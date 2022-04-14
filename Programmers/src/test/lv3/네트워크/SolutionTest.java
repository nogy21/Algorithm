package test.lv3.네트워크;

import main.lv3.네트워크.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
//                () -> assertEquals(2, sol.solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}})),
//                () -> assertEquals(1, sol.solution(3, new int[][]{{1,1,0},{1,1,1},{0,1,1}})),
                () -> assertEquals(1, sol.solution(4, new int[][]{{1,1,0,1},{1,1,0,0},{0,0,1,1},{1,0,1,1}}))
        );
    }
}
