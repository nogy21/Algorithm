package test.lv2.기능개발;

import main.lv2.기능개발.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solution() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        Solution sol = new Solution();
        Assertions.assertArrayEquals(new int[]{2, 1}, sol.solution(progresses, speeds));
    }

    @Test
    public void solution2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        Solution sol = new Solution();
        Assertions.assertArrayEquals(new int[]{1, 3, 2}, sol.solution(progresses, speeds));
    }
}
