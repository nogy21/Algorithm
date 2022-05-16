package basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 01타일 (https://www.acmicpc.net/problem/1904)
 * : 현재 1 하나만으로 이루어진 타일 또는 0타일을 두 개 붙인 한 쌍의 00타일들만이 남게 되었다.
 * 첫 번째 줄에 지원이가 만들 수 있는 길이가 N인 모든 2진 수열의 개수를 15746으로 나눈 나머지를 출력한다.
 *
 * 1 => 1
 * 2 => 11, 00 => 2
 * 3 => 111, 001, 100 => 3
 * 4 => 1111, 0011, 1001, 1100, 0000 => 5
 * 5 => 11111, 00111, 10011, 11001, 11100, 00001, 00100, 10000 => 8
 * 6 => 111111, 001111, 100111, 110011, 111001, 111100,
 *      000011, 001001, 001100, 100001, 100100, 110000, 000000 => 13
 */
public class Ex1904 {
    static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(findTotalBinaryArrayCount(N));
    }

    private static int findTotalBinaryArrayCount(int n) {
        if (dp[n] == -1) {
            dp[n] = (findTotalBinaryArrayCount(n - 1) + findTotalBinaryArrayCount(n - 2)) % 15746;
        }
        return dp[n];
    }
}
