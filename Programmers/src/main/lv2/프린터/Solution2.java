package main.lv2.프린터;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 고득점 Kit 스택/큐
 * - 프린터 (https://programmers.co.kr/learn/courses/30/lessons/42587)
 * 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
 * 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
 * 3. 그렇지 않으면 J를 인쇄합니다.
 */
public class Solution2 {
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int loc = location;

        // 순서대로 큐에 우선순위 입력
        Queue<Integer> q = new LinkedList<>();
        for (int priority : priorities) {
            q.offer(priority);
        }

        // 우선순위 정렬
        Arrays.sort(priorities);
        // 뒤에서부터 순차적으로 가장 높은 우선순위 확인
        int size = priorities.length - 1;

        while (!q.isEmpty()) {
            Integer top = q.poll();
            // 먼저 꺼낸 요소가 우선순위가 가장 높은 경우
            if (top == priorities[size - answer]) {
                answer++;
                loc--;
                // 원하는 인덱스의 작업물인 경우
                if (loc < 0) {
                    break;
                }
            } else {
                q.offer(top);
                loc--;
                // 원하는 인덱스의 작업물이 우선순위가 가장 높지 않음 -> 다시 뒤로
                if (loc < 0) {
                    loc = q.size() - 1;
                }
            }
        }

        return answer;
    }
}
