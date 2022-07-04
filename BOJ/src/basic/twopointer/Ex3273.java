package basic.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 두 수의 합 (https://www.acmicpc.net/problem/3273)
 * : n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다.
 *  ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
 *  자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * : 첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다.
 *  (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
 *
 * 출력
 * : 문제의 조건을 만족하는 쌍의 개수를 출력한다.
 *
 * 아이디어
 * : 투포인터
 */
public class Ex3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int sum = 0;
        int result = 0;

        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == x) {
                result++;
            }
            if (sum < x) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(result);
    }
}
