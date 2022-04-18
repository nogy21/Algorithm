package main.lv2.HIndex;

import java.util.Arrays;

/**
 * 고득점 Kit 정렬
 *  - H-Index (https://programmers.co.kr/learn/courses/30/lessons/42747)
 *  : 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index 입니다.
 *   어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations 가 매개변수로 주어질 때, 이 과학자의 H-Index 를 return 하도록 solution 함수를 작성해주세요.
 *
 *  아이디어
 *  :
 */
public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < len; i++) {
            int h = len - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
