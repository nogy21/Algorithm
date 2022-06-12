package test.binary.NumberOf1Bits;

import main.binary.NumberOf1Bits.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void givenUnsignedInteger_thenReturnNumberOf1bits() {
        assertAll(
                () -> test(3, 11),
                () -> test(1, 128),
                () -> test(1, 1)
        );
    }

    private void test(int expect, int given) {
        Solution sol = new Solution();
        int actual = sol.hammingWeight(given);
        assertEquals(expect, actual);
    }
}
