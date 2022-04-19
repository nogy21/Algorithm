package test.lv1.완주하지못한선수;

import main.lv1.완주하지못한선수.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals("leo", sol.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})),
                () -> assertEquals("vinko", sol.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"})),
                () -> assertEquals("mislav", sol.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}))
        );
    }
}
