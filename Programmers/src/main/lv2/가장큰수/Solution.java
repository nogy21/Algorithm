package main.lv2.가장큰수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 고득점 Kit 정렬
 * - 가장 큰 수 (https://programmers.co.kr/learn/courses/30/lessons/42746)
 *
 * 아이디어
 * :
 */

public class Solution {

    public String solution(int[] numbers) {
        if (Arrays.stream(numbers).sum() == 0) {
            return "0";
        }

        String[] arr = makeStringArr(numbers);

        // 두 문자 a+b 와 b+a 비교 -> b+a가 더 크면 b를 앞으로
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        return makeLargestNumber(arr);
    }

    private String[] makeStringArr(int[] numbers) {
        String[] retArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            retArr[i] = String.valueOf(numbers[i]);
        }
        return retArr;
    }

    private String makeLargestNumber(String[] arr) {
        String ret = "";
        for (String str : arr) {
            ret += str;
        }
        return ret;
    }
}
