package main.lv1.K번째수;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            // command
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];

            // 원하는 구간 배열 복사, 정렬
            int[] tempArr = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(tempArr);

            answer[i] = tempArr[target - 1];
        }
        return answer;
    }

}
