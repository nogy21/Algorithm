package lv1.두정수사이의합;

/**
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 *
 * 아이디어
 * : 등차수열의 합 => n(a + l) / 2
 */
public class Solution {
    public long solution(long a, long b) {
        if (a == b) return a;
        return ((a + b) * (Math.abs(a - b) + 1)) / 2;
    }
}
