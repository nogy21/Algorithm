package lv1.가운데글자가져오기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenString_thenReturnMiddleLetter() {
        Assertions.assertAll(
                () -> test("c", "abcde"),
                () -> test("we", "qwer")
        );
    }

    public void test(String expect, String s) {
        Solution sol = new Solution();
        String actual = sol.solution(s);
        Assertions.assertEquals(expect, actual);
    }
}
