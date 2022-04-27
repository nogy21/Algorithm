package test.lv1.신고결과받기;

import main.lv1.신고결과받기.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertArrayEquals(new int[]{2,1,1,0}, sol.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)),
                () -> Assertions.assertArrayEquals(new int[]{0,0}, sol.solution(new String[]{"con", "ryan"},
                        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2))
        );
    }
}
