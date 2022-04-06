package main.lv2.프린터;

import java.util.LinkedList;
import java.util.List;

/**
 * 고득점 Kit 스택/큐
 * - 프린터 (https://programmers.co.kr/learn/courses/30/lessons/42587)
 * 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
 * 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
 * 3. 그렇지 않으면 J를 인쇄합니다.
 *
 * 아이디어
 * : 큐를 사용해서 요구사항에 맞게 작성하면 O(N^3)이 나옴 -> 리스트 사용
 * - 리스트에 우선순위와 인덱스를 배열로 입력한 뒤, 요구사항에 맞게 진행.
 * 1. 리스트에서 가장 앞의 요소를 탐색한 뒤 삭제
 * 2. 탐색한 값과 리스트의 다른 값들을 비교
 * 2-1. 중요도가 높은 문서가 존재하면 꺼냈던 요소를 다시 추가하고 반복 종료
 * 3. 꺼낸 값이 우선순위가 가장 높다면 원하는 카운터 증가
 * 3-1. 원하는 값 -> 종료
 * 3-2. 아니라면 반복
 *
 */
public class Solution {
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 리스트 입력
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new int[]{i, priorities[i]});
        }

        while (true) {
            boolean check = false;

            int[] top = list.get(0);
            list.remove(0);

            // 첫 번째 요소보다 우선순위 높은 값 존재하는지 확인
            for (int i = 0; i < list.size(); i++){
                // 존재 -> 꺼낸 값을 다시 리스트에 추가
                if (top[1] < list.get(i)[1]) {
                    list.add(top);
                    check = true;
                    break;
                }
            }

            // 앞에 있던 작업물이 우선순위가 가장 높은 경우
            if (!check) {
                answer++;

                // 원하는 작업물
                if (top[0] == location) {
                    break;
                }
            }
        }

        return answer;
    }
}
