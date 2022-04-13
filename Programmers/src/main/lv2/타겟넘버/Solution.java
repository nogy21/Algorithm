package main.lv2.타겟넘버;

/**
 * 고득점 Kit 정렬
 * - 타겟넘버 (https://programmers.co.kr/learn/courses/30/lessons/43165)
 * - n개의 음이 아닌 정수들의 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만든다
 *
 * 아이디어
 * 1. DFS 탐색
 *
 * 시간복잡도
 *  - 주어지는 숫자의 개수는 2개 이상 20개 이하
 *  - 각 숫자는 1 이상 50 이하인 자연수
 *  - 타겟 넘버는 1 이상 1000 이하인 자연수
 * : DFS 탐색 => O(2^n) => 1,000,000 => 가능, 연산 역시 +, - 이므로 정수 범위 가능
 *
 */

public class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 1, 0);
        return answer;
    }

    private void dfs(int[] numbers, int target, int depth, int result) {
        // 숫자 모두 사용
        if (depth > numbers.length) {
            // 결과 만족
            if (result == target) {
                answer++;
            }
            return;
        }

        for (int i = -1; i < 2; i += 2) {
            dfs(numbers, target, depth + 1, result + numbers[depth - 1] * i);
        }
    }
}
