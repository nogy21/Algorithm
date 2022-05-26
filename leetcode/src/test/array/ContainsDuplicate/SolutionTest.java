package test.array.ContainsDuplicate;

import main.array.ContainsDuplicate.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, sol.containsDuplicate(new int[]{1,2,3,1})),
                () -> Assertions.assertEquals(false, sol.containsDuplicate(new int[]{1,2,3,4})),
                () -> Assertions.assertEquals(true, sol.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}))
        );
    }

    @Test
    public void solution2() {
        Solution sol2 = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, sol2.containsDuplicate2(new int[]{1,2,3,1})),
                () -> Assertions.assertEquals(false, sol2.containsDuplicate2(new int[]{1,2,3,4})),
                () -> Assertions.assertEquals(true, sol2.containsDuplicate2(new int[]{1,1,1,3,3,4,3,2,4,2}))
        );
    }
}
