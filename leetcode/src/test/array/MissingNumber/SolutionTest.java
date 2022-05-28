package test.array.MissingNumber;

import main.array.MissingNumber.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        assertAll(
                () -> assertEquals(2, sol.missingNumber(new int[]{3,0,1})),
                () -> assertEquals(2, sol.missingNumber(new int[]{0,1})),
                () -> assertEquals(8, sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}))
        );
    }
}
