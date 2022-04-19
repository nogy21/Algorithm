package main.lv1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수 (https://programmers.co.kr/learn/courses/30/lessons/42576)
 * - 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 *   완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * - 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * - completion의 길이는 participant의 길이보다 1 작습니다.
 * - 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * - 참가자 중에는 동명이인이 있을 수 있습니다.
 *
 * 아이디어
 * : 동명이인에 주의, 미완주자는 한 명
 * 1. HashMap 사용, 키 - 이름 & 밸류 - 1(동명이인: +1)
 * 2. 완주자 명단을 순회하며 완주자의 밸류에 -1
 * 3. 밸류가 0이 아닌 참가자가 정답
 */
public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        // key: 이름, value: 1 or 동명이인(기존 + 1)
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // key 존재 시 value 감소
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // value 가 0이 아닌 경우
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() != 0) {
                answer = m.getKey();
                break;
            }
        }

        return answer;
    }
}
