package test.lv1.로또의최고순위와최저순위;

import main.lv1.로또의최고순위와최저순위.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertArrayEquals(new int[]{3,5}, sol.solution(new int[]{44, 1, 0, 0, 31, 25},
                        new int[]{31, 10, 45, 1, 6, 19})),
                () -> Assertions.assertArrayEquals(new int[]{1,6}, sol.solution(new int[]{0, 0, 0, 0, 0, 0},
                        new int[]{38, 19, 20, 40, 15, 25})),
                () -> Assertions.assertArrayEquals(new int[]{1,1}, sol.solution(new int[]{45, 4, 35, 20, 3, 9},
                        new int[]{20, 9, 3, 45, 4, 35}))
        );
    }
}
