package Programmers.src.test.lv2._124나라의숫자;

import Programmers.src.main.lv2._124나라의숫자.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void givenInteger__thenChangeTwoOneTwoFourSystem() {
        assertAll(
                () -> test( "1", 1),
                () -> test("2", 2),
                () -> test("4", 3),
                () -> test("11", 4),
                () -> test("12", 5),
                () -> test("14", 6),
                () -> test("21", 7)
        );
    }

    private void test(String expect, int given) {
        Solution sol = new Solution();
        String actual = sol.solution(given);
        assertEquals(expect, actual);
    }
}
