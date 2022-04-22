package test.lv2.소수찾기;

import main.lv2.소수찾기.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(3, sol.solution("17")),
                () -> assertEquals(2, sol.solution("011"))
        );
    }
}
