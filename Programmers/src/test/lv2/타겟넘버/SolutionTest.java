package test.lv2.타겟넘버;

import main.lv2.타겟넘버.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(5, sol.solution(new int[]{1, 1, 1, 1, 1}, 3)),
                () -> assertEquals(2, sol.solution(new int[]{4, 1, 2, 1}, 4))
        );
    }
}
