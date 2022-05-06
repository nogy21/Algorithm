package main.lv1.로또의최고순위와최저순위;

import java.util.LinkedList;
import java.util.Queue;

/**
 * lv1 로또의 최고 순위와 최저 순위 (https://programmers.co.kr/learn/courses/30/lessons/77484?language=java)
 * : 0은 알아볼 수 없는 숫자를 의미합니다. 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
 * 1	6개 번호가 모두 일치
 * 2	5개 번호가 일치
 * 3	4개 번호가 일치
 * 4	3개 번호가 일치
 * 5	2개 번호가 일치
 * 6(낙첨)	그 외
 *
 * 아이디어
 * : 0을 제외한 일치하는 번호의 개수가 최소값, 최소값에 0의 개수를 더하면 최대값이 나옴.
 */
public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            q.offer(win_nums[i]);
        }

        int totalZero = 0, cnt = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                totalZero++;
                continue;
            }
            for (int j = 0; j < q.size(); j++) {
                int tmp = q.poll();
                if (lottos[i] != tmp) {
                    q.offer(tmp);
                    continue;
                }
                cnt++;
            }
        }

        int worst = 7 - cnt;
        if (cnt == 0) {
            worst--;
        }
        int best = 7 - (cnt + totalZero);
        if (best == 0) {
            best--;
        }
        int[] answer = {best, worst};
        return answer;
    }
}
