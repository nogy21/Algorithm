package array.ContainerWithMostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(49, sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})),
                () -> assertEquals(25, sol.maxArea(new int[]{10,9,8,7,6,5,4,3,2,1})),
                () -> assertEquals(1, sol.maxArea(new int[]{1,1})),
                () -> assertEquals(200, sol.maxArea(new int[]{1,8,100,2,100,4,8,3,7})),
                () -> assertEquals(17, sol.maxArea(new int[]{2,3,4,5,18,17,6}))
        );
    }
}
