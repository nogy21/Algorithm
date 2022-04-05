package test.lv1.스킬체크2;

import main.lv1.스킬체크2.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        int x = 11;
        assertFalse(sol.solution(x));

        x = 12;
        assertTrue(sol.solution(x));

        x = 13;
        assertFalse(sol.solution(x));
    }

}
