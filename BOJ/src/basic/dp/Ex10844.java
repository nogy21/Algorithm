package basic.dp;

import java.io.IOException;
import java.util.Scanner;

/**
 * 쉬운 계단 수 (https://www.acmicpc.net/problem/10844)
 * : 45656이란 수를 보자. 이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.
 *  N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
 *
 * 아이디어
 * : DP / bottom-up. 자리수별로 각 숫자마다 가능한 경우의 수를 모두 더하는 방식으로 진행.
 *  세자리수로 예를 들면, 일의 자리에서는 1부터 9까지 모두 가능. 
 *  십의 자리에서는 0부터 9까지 가능, 0과 9는 이전 숫자가 1과 8로 고정. 나머지 숫자는 2가지 경우 가능(이전 자리수 숫자의 인접한 숫자)
 *  백의 자리에서는 십의 자리에서 가능했던 수를 이어받으며, 마찬가지로 0과 9를 유의.
 */
public class Ex10844 {
    private static final long MOD = 1000000000L; // 값이 커서 스택오버플로우가 발생할 수 있으므로 그 전에 나눠줘야 함
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] dp = new long[N][10]; // N 자리수별로 0~9 각 숫자의 경우의 수
        // 일의 자리 초기화
        dp[0][0] = 0L;
        for (int i = 1; i < 10; i++) {
            dp[0][i] = 1L;
        }
        long sum = 9L;

        // 십의 자리 이상
        for (int i = 1; i < N; i++) {
            sum = 0; // 이전 자리수의 경우의 수를 이어가기에 sum 초기화

            for (int j = 0; j < 10; j++) {
                if (j == 0) { // 이전 자리수에서 1의 경우의 수
                    dp[i][j] = dp[i - 1][j + 1];
                } else if (j == 9) { // 이전 자리수에서 8의 경우의 수
                    dp[i][j] = dp[i - 1][j - 1];
                } else { // 이전 자리수에서 인접한 숫자들의 경우의 수
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
                }

                dp[i][j] %= MOD; // sum 에 누적하기 전에 미리 나눠줌
                sum = (sum + dp[i][j]) % MOD; // 누적 후 다시 나눠줌
            }
        }

        System.out.println(sum);
    }
}
