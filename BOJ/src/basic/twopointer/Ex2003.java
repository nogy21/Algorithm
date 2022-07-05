package basic.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 수들의 합 (https://www.acmicpc.net/problem/2003)
 * : N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다.
 *  이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * : 첫째 줄에 N(1 ≤ N ≤ 10,000), M(1 ≤ M ≤ 300,000,000)이 주어진다.
 *  다음 줄에는 A[1], A[2], …, A[N]이 공백으로 분리되어 주어진다. 각각의 A[x]는 30,000을 넘지 않는 자연수이다.
 *
 * 출력
 * : 첫째 줄에 경우의 수를 출력한다.
 *
 * 아이디어
 * : 투포인터.
 * start, end 두 포인터를 0번째부터 end 포인터의 값을 늘려가며 구간합 저장.
 * 1. 구간합이 목표값인 경우 카운트 증가.
 * 2. 목표값보다 작은 경우 end 증가
 * 3. 목표값보다 큰 경우 start 증가
 * start는 end보다 작으며 start가 N-1번째가 될 때 까지 진행
 */
public class Ex2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;

        while (start < N) {
            if (sum == M) cnt++;
            if (sum > M || end == N) {
                sum -= arr[start++];
            } else {
                sum += arr[end++];
            }
        }
        System.out.println(cnt);
    }
}
