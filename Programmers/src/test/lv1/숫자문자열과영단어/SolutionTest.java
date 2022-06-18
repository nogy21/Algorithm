package Programmers.src.test.lv1.숫자문자열과영단어;

import Programmers.src.main.lv1.숫자문자열과영단어.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * s	result
 * "one4seveneight"	1478
 * "23four5six7"	234567
 * "2three45sixseven"	234567
 * "123"	123
 */
public class SolutionTest {
    @Test
    public void givenNumbersWithEnglishWords_thenToInteger() {
        Assertions.assertAll(
                () -> test(1478, "one4seveneight"),
                () -> test(234567, "23four5six7"),
                () -> test(234567, "2three45sixseven"),
                () -> test(123, "123")
        );
    }

    private void test(int expect, String given) {
        Solution sol = new Solution();
        int actual = sol.solution(given);
        Assertions.assertEquals(expect, actual);
    }
}
