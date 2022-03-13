package basic.segment;

import java.io.*;
import java.util.*;

/**
 * 개똥벌레 (https://www.acmicpc.net/problem/3020)
 */
public class Ex3020 {
    static int[] floor, ceil;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        floor = new int[H + 1];
        ceil = new int[H + 1];

        for (int i = 0; i < N / 2; i++) {
            floor[Integer.parseInt(br.readLine())]++;
            ceil[Integer.parseInt(br.readLine())]++;
        }

        // 구간 합 구하기
        for (int i = H - 1; i > 0; i--) {
            floor[i] += floor[i + 1];
            ceil[i] += ceil[i + 1];
        }

        // 최소값과 개수 구하기
        int[] result = new int[H + 1];
        int min = Integer.MAX_VALUE, cnt = 0;
        for (int i = 1; i <= H; i++) {
            result[i] = floor[i] + ceil[H - i + 1];
            min = Math.min(result[i], min);
        }
        for (int i = 1; i <= H; i++) {
            if (result[i] == min) {
                cnt++;
            }
        }

        System.out.println(min + " " + cnt);
    }
}
