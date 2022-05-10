package basic.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 숫자 카드2 (https://www.acmicpc.net/problem/10816)
 * : 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
 *  정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램
 *
 * 아이디어
 * : 이분 탐색. 중복 원소의 왼쪽 끝 값과 오른쪽 끝 값을 알아냄(상한 - 하한)
 */
public class Ex10816_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            sb.append(upperBound(arr, target) - lowerBound(arr, target)).append(" ");
        }

        System.out.println(sb);
    }

    private static int upperBound(int[] arr, int target) {
        int lowVal = 0;
        int highVal = arr.length;

        while (lowVal < highVal) {
            int mid = (lowVal + highVal) / 2;

            if (target < arr[mid]) {
                highVal = mid;
            } else {
                lowVal = mid + 1;
            }
        }

        return lowVal;
    }

    private static int lowerBound(int[] arr, int target) {
        int lowVal = 0;
        int highVal = arr.length;

        while (lowVal < highVal) {
            int mid = (lowVal + highVal) / 2;

            if (target <= arr[mid]) {
                highVal = mid;
            } else {
                lowVal = mid + 1;
            }
        }

        return lowVal;
    }
}
