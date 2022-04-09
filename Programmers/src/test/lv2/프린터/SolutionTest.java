package test.lv2.프린터;

import main.lv2.프린터.Solution;
import main.lv2.프린터.Solution2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(1, sol.solution(new int[]{2, 1, 3, 2}, 2)),
                () -> assertEquals(5, sol.solution(new int[]{1, 1, 9, 1, 1, 1}, 0))
        );
    }

    @Test
    public void solution2() {
        Solution2 sol2 = new Solution2();

        assertAll(
                () -> assertEquals(1, sol2.solution(new int[]{2, 1, 3, 2}, 2)),
                () -> assertEquals(5, sol2.solution(new int[]{1, 1, 9, 1, 1, 1}, 0))
        );
    }
}
