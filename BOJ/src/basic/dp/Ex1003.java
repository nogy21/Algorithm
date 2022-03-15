package basic.dp;

import java.io.*;

/**
 * 피보나치 함수 (https://www.acmicpc.net/problem/1003)
 */
public class Ex1003 {
    static int N;
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            findZeroAndOneInFibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }

        System.out.println(sb);
    }

    private static Integer[] findZeroAndOneInFibonacci(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = findZeroAndOneInFibonacci(N - 1)[0] + findZeroAndOneInFibonacci(N - 2)[0];
            dp[N][1] = findZeroAndOneInFibonacci(N - 1)[1] + findZeroAndOneInFibonacci(N - 2)[1];
        }
        return dp[N];
    }
}
