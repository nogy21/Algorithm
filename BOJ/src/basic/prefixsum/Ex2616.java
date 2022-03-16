package basic.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소형 기관차 (https://www.acmicpc.net/problem/2616)
 * 구간 합 구하기 + 다이내믹 프로그래밍
 * 객차 수 <= 50000, 객차 별 손님 수 <= 100, 소형 기관차가 끌 수 있는 객차 수 <= 전체 객차 수 / 3
 *
 * 점화식 (i: 기관차 번호(1,2,3), j: 객차 번호, max: 끌 수 있는 최대 객차 수)
 * dp[i][j] = max(dp[i][j-1], dp[i-1][j-max] + (sum[j]-sum[j-max]))
 */
public class Ex2616 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] sum = new int[n + 1];
        int[][] dp = new int[4][n + 1]; // i번째 기관차가 j번 까지의 객차 중 최대로 운송할 수 있는 승객 수

        st = new StringTokenizer(br.readLine());
        sum[1] = Integer.parseInt(st.nextToken());
        int tmp;
        for (int i = 2; i <= n; i++) {
            tmp = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + tmp; // 구간 합을 구하기 위한 i칸 까지의 승객 수
        }

        int max = Integer.parseInt(br.readLine());

        for (int i = 1; i < 4; i++) {
            for (int j = i * max; j <= n; j++) {
                // dp[i][j-1]: 이전 객차까지 최대 승객 수
                // dp[i-1][j-m]: j-m번 객차까지 i-1번째 기관차의 최대 승객 수
                // sum[j] - sum[j-max]: j-m부터 j번 객차까지 승객 수
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j - max] + (sum[j] - sum[j - max]));
            }
        }

        System.out.println(dp[3][n]);
    }
}
