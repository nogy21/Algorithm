package array.FindMinimumInRotatedSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();
        Assertions.assertAll(
                () -> Assertions.assertEquals(1, sol.findMin(new int[]{3,4,5,1,2})),
                () -> Assertions.assertEquals(1, sol.findMin(new int[]{2,3,4,5,1})),
                () -> Assertions.assertEquals(1, sol.findMin(new int[]{4,5,1,2,3})),
                () -> Assertions.assertEquals(1, sol.findMin(new int[]{1,2,3,4,5})),
                () -> Assertions.assertEquals(0, sol.findMin(new int[]{4,5,6,7,0,1,2})),
                () -> Assertions.assertEquals(11, sol.findMin(new int[]{11,13,15,17}))
        );
    }
}
