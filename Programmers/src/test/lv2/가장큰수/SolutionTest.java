package test.lv2.가장큰수;

import main.lv2.가장큰수.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals("6210", sol.solution(new int[]{6, 10, 2})),
                () -> assertEquals("9534330", sol.solution(new int[]{3, 30, 34, 5, 9}))
        );
    }
}
