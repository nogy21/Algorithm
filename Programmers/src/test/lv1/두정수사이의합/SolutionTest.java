package lv1.두정수사이의합;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenTwoNumbers_thenAddAllNumbersBetweenThem() {
        Assertions.assertAll(
                () -> test(12, 3, 5),
                () -> test(3, 3, 3),
                () -> test(12, 5, 3)
        );
    }

    private void test(long expect, long a, long b) {
        Solution sol = new Solution();
        long actual = sol.solution(a, b);
        Assertions.assertEquals(expect, actual);
    }

}
