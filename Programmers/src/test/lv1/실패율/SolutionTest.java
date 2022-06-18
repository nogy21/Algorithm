package Programmers.src.test.lv1.실패율;

import Programmers.src.main.lv1.실패율.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    /**
     * 입출력 예
     * N	stages	                    result
     * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
     * 4	[4,4,4,4,4]	                [4,1,2,3]
     */
    @Test
    public void givenStagesAndNumber_thenFindReversedFailureArray() {
        Assertions.assertAll(
                () -> test(new int[]{3,4,2,1,5}, 5, new int[]{2,1,2,6,2,4,3,3}),
                () -> test(new int[]{4,1,2,3}, 4, new int[]{4,4,4,4,4})
        );
    }

    private void test(int[] expect, int N, int[] stages) {
        Solution sol = new Solution();
        int[] actual = sol.solution(N, stages);
        Assertions.assertArrayEquals(expect, actual);
    }
}
