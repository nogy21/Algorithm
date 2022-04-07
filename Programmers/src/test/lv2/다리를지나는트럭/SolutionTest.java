package test.lv2.다리를지나는트럭;

import main.lv2.다리를지나는트럭.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(8, sol.solution(2, 10, new int[]{7, 4, 5, 6})),
                () -> assertEquals(101, sol.solution(100, 100, new int[]{10})),
                () -> assertEquals(110, sol.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}))
        );
    }

}
