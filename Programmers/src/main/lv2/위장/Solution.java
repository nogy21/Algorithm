package main.lv2.위장;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 고득점 Kit 해시
 * - 위장 (https://programmers.co.kr/learn/courses/30/lessons/42578)
 * - 스파이가 가진 의상들이 담긴 2차원 배열 clothes 가 주어질 때, 서로 다른 옷의 조합의 수를 return
 * 제한사항
 * - clothes 의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
 * - 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
 * - 같은 이름을 가진 의상은 존재하지 않습니다.
 * - clothes 의 모든 원소는 문자열로 이루어져 있습니다.
 * - 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
 * - 스파이는 하루에 최소 한 개의 의상은 입습니다.
 *
 * 아이디어
 * : 옷을 입을 수 있는 방법 분리, 예외 상황 확인
 * 1. 종류별 구분
 * 2. 종류별로 곱
 * 3. 예외(모두 null 인 경우)
 */
public class Solution {
    public int solution(String[][] clothes) {
        // 1. 종류별 구분(null 포함)
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 1) + 1);
        }

        // 2. 종류별 곱
        int answer = 1;
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= it.next().intValue();
        }

        // 3. 모두 null 인 경우 제외
        return answer - 1;
    }
}
