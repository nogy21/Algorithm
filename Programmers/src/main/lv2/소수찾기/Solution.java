package main.lv2.소수찾기;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 고득점 Kit 완전탐색
 * - 소수 찾기 (https://programmers.co.kr/learn/courses/30/lessons/42839)
 * - 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return
 *
 * 제한사항
 * - numbers 는 길이 1 이상 7 이하인 문자열입니다.
 * - numbers 는 0~9까지 숫자만으로 이루어져 있습니다.
 * - "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 *
 * 아이디어
 * 1. 입력받은 문자열로 조합 가능한 모든 문자열 배열 생성
 * 2. 소수 판단 후 카운트 증가
 */
public class Solution {
    public int solution(String numbers) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();
        // 순열
        perm("", numbers, set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            int num = (int) it.next();
            set.remove(num);

            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    private void perm(String prefix, String str, HashSet<Integer> set) {
        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }

        int len = str.length();
        for (int i = 0; i < len; i++) {
            perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, len), set);
        }
    }

    private boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;    }
}
