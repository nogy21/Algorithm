package lv1.수박수박수박수박수박수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenNumber_thenReturn수박WithLengthOfInteger() {
        Assertions.assertAll(
                () -> test("수박수", 3),
                () -> test("수박수박", 4),
                () -> test("수박수박수", 5)
        );
    }

    private void test(String expect, int n) {
        Solution sol = new Solution();
        String actual = sol.solution(n);
        Assertions.assertEquals(expect, actual);
    }
}
