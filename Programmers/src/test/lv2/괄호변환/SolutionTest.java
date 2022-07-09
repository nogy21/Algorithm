package lv2.괄호변환;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 입출력 예
 *      p	        result
 * "(()())()"	  "(()())()"
 *    ")("	         "()"
 * "()))((()"	  "()(())()"
 *
 * 입출력 예 #3
 * 두 문자열 u, v로 분리합니다.
 * u = "()"
 * v = "))((()"
 * 문자열 u가 "올바른 괄호 문자열"이므로 그대로 두고, v에 대해 재귀적으로 수행합니다.
 * 다시 두 문자열 u, v로 분리합니다.
 * u = "))(("
 * v = "()"
 * u가 "올바른 괄호 문자열"이 아니므로 다음과 같이 새로운 문자열을 만듭니다.
 * v에 대해 1단계부터 재귀적으로 수행하면 "()"이 반환됩니다.
 * u의 앞뒤 문자를 제거하고, 나머지 문자의 괄호 방향을 뒤집으면 "()"이 됩니다.
 * 따라서 생성되는 문자열은 "(" + "()" + ")" + "()"이며, 최종적으로 "(())()"를 반환합니다.
 * 처음에 그대로 둔 문자열에 반환된 문자열을 이어 붙이면 "()" + "(())()" = "()(())()"가 됩니다.
 */
public class SolutionTest {
    @Test
    public void givenParentheses_whenSplitAndCheck_thenMakePerfect() {
        Assertions.assertAll(
                () -> test("(()())()","(()())()"),
                () -> test("()",")("),
                () -> test("()(())()","()))((()")
        );
    }

    private void test(String expect, String given) {
        Solution sol = new Solution();
        String actual = sol.solution(given);
        Assertions.assertEquals(expect, actual);
    }
}
