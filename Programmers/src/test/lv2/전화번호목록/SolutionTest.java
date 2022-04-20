package test.lv2.전화번호목록;

import main.lv2.전화번호목록.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solution () {
        Solution sol = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertEquals(false, sol.solution(new String[]{"119","97674223","1195524421"})),
                () -> Assertions.assertEquals(true, sol.solution(new String[]{"123","456","789"})),
                () -> Assertions.assertEquals(false, sol.solution(new String[]{"12","123","1235","567","88"}))
        );
    }
}
