package Programmers.src.test.lv1.소수만들기;

import Programmers.src.main.lv1.소수만들기.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenIntegerArray_whenPickThreeNumbers_thenFindAllPrimeNumbers() {
        Assertions.assertAll(
                () -> test(1, new int[]{1,2,3,4}),
                () -> test(4, new int[]{1,2,7,6,4})
        );
    }

    private void test(int expect, int[] given) {
        Solution sol = new Solution();
        int actual = sol.solution(given);
        Assertions.assertEquals(expect, actual);
    }
}
