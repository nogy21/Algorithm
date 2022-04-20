package main.lv2.전화번호목록;

import java.util.Arrays;

/**
 * 고득점 Kit 정렬
 * - 전화번호 목록 (https://programmers.co.kr/learn/courses/30/lessons/42577)
 * - 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하는 문제
 *  - 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수
 *  - 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false, 그렇지 않으면 true 를 return
 *
 * 아이디어
 * : 문자열은 정렬 시 사전식 오름차순 정렬됨. 각 전화번호마다 순회할 필요 X.
 *   0번 번호와 1번 번호, 1번 번호와 2번 번호와 같이 인접한 번호만 비교
 *   -> 앞에서 적은 수부터 시작하는 번호가 뒤의 숫자의 시작 부분으로 포함되는지 확인 가능
 *
 * 1. 전화번호 정렬
 * 2. 앞의 전화번호로 뒤의 전화번호가 시작되는지 확인
 */
public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        /*for (String s : phone_book) {
            System.out.print(s + " ");
        }
        System.out.println();*/
        Arrays.sort(phone_book);
        /*for (String s : phone_book) {
            System.out.print(s + " ");
        }
        System.out.println("---------");*/
        int len = phone_book.length;
        for (int i = 0; i < len - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
