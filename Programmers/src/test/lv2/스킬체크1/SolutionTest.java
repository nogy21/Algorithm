package test.lv2.스킬체크1;

import main.lv2.스킬체크1.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals("1", sol.solution(1)),
                () -> assertEquals("2", sol.solution(2)),
                () -> assertEquals("4", sol.solution(3)),
                () -> assertEquals("11", sol.solution(4)),
                () -> assertEquals("12", sol.solution(5)),
                () -> assertEquals("14", sol.solution(6))
        );
    }
}
