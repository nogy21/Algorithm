package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 통계학 (https://www.acmicpc.net/problem/2108)
 *
 * 첫 번째 풀이 시간초과로 인해 메서드 분리 X
 * 블로그 참고
 */
public class Ex2108_2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // -4000 ~ 4000
        int[] arr = new int[8001];

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int medianVal = 4001;
        int modeVal = 4001;

        // 입력
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            sum += val;
            arr[val + 4000]++;

            if (max < val) {
                max = val;
            }
            if (min > val) {
                min = val;
            }
        }

        int medCnt = 0;
        int modeCnt = 0;
        boolean flag = false;
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                if (medCnt < (n + 1) / 2) {
                    medCnt += arr[i];
                    medianVal = i - 4000;
                }

                if (modeCnt < arr[i]) {
                    modeCnt = arr[i];
                    modeVal = i - 4000;
                    flag = true;
                } else if (modeCnt == arr[i] && flag) {
                    modeVal = i - 4000;
                    flag = false;
                }
            }
        }


        sb.append((int) Math.round((double)sum / n)).append("\n");
        sb.append(medianVal).append("\n");
        sb.append(modeVal).append("\n");
        sb.append(max - min).append("\n");

        System.out.println(sb);
    }
}
