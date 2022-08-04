package lv1.두개뽑아서더하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenTwoArrays_whenPickTwoNumbers_thenReturnOrderedArray() {
        Assertions.assertAll(
                () -> test(new int[]{2,3,4,5,6,7}, new int[]{2,1,3,4,1}),
                () -> test(new int[]{2,5,7,9,12}, new int[]{5,0,2,7})
        );
    }

    public void test(int[] expect, int[] numbers) {
        Solution sol = new Solution();
        int[] actual = sol.solution(numbers);
        Assertions.assertArrayEquals(expect, actual);
    }
}
