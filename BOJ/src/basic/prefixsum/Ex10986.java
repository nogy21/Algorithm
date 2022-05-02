package basic.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나머지 합 (https://www.acmicpc.net/problem/10986)
 * : 수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
 * 즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.
 *
 * 아이디어
 * : 누적합 구한 뒤 부분 구간의 합이 M으로 나누어 떨어지는 식을 구하면 다음과 같다.
 * (Sj - Si) % M == 0, 즉 Sj % M == Si % M 과 같고,
 * 임의의 두 누적합이 모두 M으로 나눈 나머지가 0인 경우의 수를 구하면 된다.
 * 그러므로, 누적합을 M으로 나눴을 때 나머지가 0이면 카운트(n)를 증가하고, 카운트(n) 2 개를 무작위로 뽑을 수 있는 경우의 수인 n*(n-1)/2를 구한다
 */
public class Ex10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] count = new int[M];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            count[sum]++;
        }

        long answer = count[0];
        for (int i = 0; i < M; i++) {
            answer += (long) count[i] * (count[i] - 1) / 2;
        }
        System.out.println(answer);
    }
}
