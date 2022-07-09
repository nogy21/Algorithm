package lv2.괄호변환;

import java.util.Stack;

/**
 * 괄호 변환
 * : 카카오에 신입 개발자로 입사한 "콘"은 선배 개발자로부터 개발역량 강화를 위해 다른 개발자가 작성한 소스 코드를 분석하여 문제점을 발견하고 수정하라는 업무 과제를 받았습니다.
 *  소스를 컴파일하여 로그를 보니 대부분 소스 코드 내 작성된 괄호가 개수는 맞지만 짝이 맞지 않은 형태로 작성되어 오류가 나는 것을 알게 되었습니다.
 *  수정해야 할 소스 파일이 너무 많아서 고민하던 "콘"은 소스 코드에 작성된 모든 괄호를 뽑아서 올바른 순서대로 배치된 괄호 문자열을 알려주는 프로그램을 다음과 같이 개발하려고 합니다.
 *
 * 용어의 정의
 * : '(' 와 ')' 로만 이루어진 문자열이 있을 경우, '(' 의 개수와 ')' 의 개수가 같다면 이를 균형잡힌 괄호 문자열이라고 부릅니다.
 *  그리고 여기에 '('와 ')'의 괄호의 짝도 모두 맞을 경우에는 이를 올바른 괄호 문자열이라고 부릅니다.
 *  예를 들어, "(()))("와 같은 문자열은 "균형잡힌 괄호 문자열" 이지만 "올바른 괄호 문자열"은 아닙니다.
 *  반면에 "(())()"와 같은 문자열은 "균형잡힌 괄호 문자열" 이면서 동시에 "올바른 괄호 문자열" 입니다.
 *
 * 매개변수 설명
 * : p는 '(' 와 ')' 로만 이루어진 문자열이며 길이는 2 이상 1,000 이하인 짝수입니다.
 *  문자열 p를 이루는 '(' 와 ')' 의 개수는 항상 같습니다.
 *  만약 p가 이미 "올바른 괄호 문자열"이라면 그대로 return 하면 됩니다.
 */
public class Solution {

    public String solution(String p) {
        String answer = recursion(p);
        return answer;
    }

    private String recursion(String p) {
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if (p.equals("")) return p;

        // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
        StringBuilder u = new StringBuilder();
        u.append(split(p));
        if (u.equals(p)) return p;
        StringBuilder v = new StringBuilder();
        v.append(p.substring(u.length()));

        // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
        // 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
        if (isValid(u.toString())) {
            return u.append(recursion(v.toString())).toString();
        }

        // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
        // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
        StringBuilder temp = new StringBuilder();
        temp.append("(");

        // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
        // 4-3. ')'를 다시 붙입니다.
        temp.append(recursion(v.toString())).append(")");
        // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
        u.deleteCharAt(0).deleteCharAt(u.length() - 1);
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                u.setCharAt(i, ')');
            } else {
                u.setCharAt(i, '(');
            }
        }
        temp.append(u);
        // 4-5. 생성된 문자열을 반환합니다.
        return temp.toString();
    }

    private static String split(String p) {
        int cnt1 = 0;
        int cnt2 = 0;
        int idx = 0;

        for (int i = 0; i < p.length(); i++) {
            char curr = p.charAt(i);
            if (curr == '(') {
                cnt1++;
            } else {
                cnt2++;
            }

            if (cnt1 == cnt2) {
                idx = i + 1;
                break;
            }
        }

        return p.substring(0, idx);
    }

    private static boolean isValid(String p) {
        Stack<Character> stack = new Stack<>();
        stack.push(p.charAt(0));

        for (int i = 1; i < p.length(); i++) {
            char c = p.charAt(i);
            if (stack.peek() == '(' && c == ')') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
