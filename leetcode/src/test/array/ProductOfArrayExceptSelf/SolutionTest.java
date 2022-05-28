package test.array.ProductOfArrayExceptSelf;

import main.array.ProductOfArrayExceptSelf.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        assertAll(
                () -> assertArrayEquals(new int[]{24, 12, 8, 6}, sol.productExceptSelf(new int[]{1, 2, 3, 4})),
                () -> assertArrayEquals(new int[]{0, 0, 9, 0, 0}, sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3}))
        );
    }
}
