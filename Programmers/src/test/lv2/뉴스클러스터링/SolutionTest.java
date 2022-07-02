package Programmers.src.test.lv2.뉴스클러스터링;

import Programmers.src.main.lv2.뉴스클러스터링.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenTwoStrings_whenMakeMultipleSets_thenFindJakardSimilarity() {
        Assertions.assertAll(
                () -> test(16384, "FRANCE", "french"),
                () -> test(65536, "handshake", "shake hands"),
                () -> test(43690, "aa1+aa2", "AAAA12"),
                () -> test(65536, "E=M*C^2", "e=m*c^2"),
                () -> test(65536, "A+C", "DEF")
        );
    }

    private void test (int expect, String givenStr1, String givenStr2) {
        Solution sol = new Solution();
        int actual = sol.solution(givenStr1, givenStr2);
        Assertions.assertEquals(expect, actual);
    }
}
