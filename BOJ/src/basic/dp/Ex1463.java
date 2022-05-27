package basic.dp;

import java.io.IOException;
import java.util.Scanner;

/**
 * 1로 만들기 (https://www.acmicpc.net/problem/1463)
 * : 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *  X가 3으로 나누어 떨어지면, 3으로 나눈다.
 *  X가 2로 나누어 떨어지면, 2로 나눈다.
 *  1을 뺀다.
 *  정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * 아이디어
 * : DP
 * 반복문으로 모든 수를 확인. 1부터 시작해서 최소값을 저장, 세 가지 경우 고려
 * 1) 1을 뺀 후 이전 최소값를 더한 것, 2) 3으로 나누어 떨어짐, 3) 2로 나누어 떨어짐
 */
public class Ex1463 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}
