package basic.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 랜선 자르기 (https://www.acmicpc.net/problem/1654)
 * : 길이가 제각각인 K개의 랜선이 있다. 랜선을 모두 N개의 같은 길이의 랜선으로 만들 때 최대 랜선의 길이를 구하라
 *
 * 아이디어
 * : 이분 탐색, 중간값 -> (최소 길이 + 최대 길이) / 2,
 *  중간값으로 만들어지는 랜선의 개수와 N 비교하며 최소값이 최대값보다 커질 때 까지 반복
 */
public class Ex1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        long answer = findMaxLength(N, arr, max + 1);
        System.out.println(answer);
    }

    private static long findMaxLength(int n, int[] arr, long max) {
        long min = 1, mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;

            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i] / mid;
            }

            if (cnt >= n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min - 1;
    }
}
