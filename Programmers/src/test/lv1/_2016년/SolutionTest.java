package Programmers.src.test.lv1._2016년;

import Programmers.src.main.lv1._2016년.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals("FRI", sol.solution(1, 1)),
                () -> assertEquals("TUE", sol.solution(5, 24)),
                () -> assertEquals("SAT", sol.solution(12, 31)),
                () -> assertEquals("MON", sol.solution(2, 29)),
                () -> assertEquals("THU", sol.solution(12, 1))
        );
    }

}
