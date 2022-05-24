package test.array.TwoSome;

import main.array.TwoSome.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        Assertions.assertArrayEquals(new int[]{0, 1}, sol.twoSumVer1(new int[]{2,7,11,15},9));
        Assertions.assertArrayEquals(new int[]{0, 1}, sol.twoSumVer2(new int[]{2,7,11,15},9));
    }
}
