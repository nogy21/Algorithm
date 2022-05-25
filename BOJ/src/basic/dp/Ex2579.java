package basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 계단 오르기 (https://www.acmicpc.net/problem/2579)
 * : 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
 *  연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다. 마지막 도착 계단은 반드시 밟아야 한다.
 *  각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 아이디어
 * : DP. 마지막 계단은 반드시 밟아야 하고, 연속된 세 개의 계단을 밟을 수는 없다.
 * 1) 마지막 계단과 마지막 전 계단을 모두 밟은 경우
 * => DP[N] = arr[N] + arr[N-1] + DP[N-3]
 * 2) 이전 계단은 밟지 않을 경우
 * => DP[N] = arr[N] + DP[N-2]
 */
public class Ex2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[300];
        int[] dp = new int[300];

        for (int i = 0; i < n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(stairs[i] + stairs[i - 1] + dp[i - 3], stairs[i] + dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
    }
}
