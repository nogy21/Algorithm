package basic.dp;

import java.io.IOException;
import java.util.Scanner;

/**
 * 파도반 수열 (https://www.acmicpc.net/problem/9461)
 * : 나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.
 *  파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다.
 *  P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.
 *  N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.
 *
 * 아이디어
 * : 5(n)번 인덱스부터 해당 인덱스 = (n-1)번째 인덱스 - (n-5)번째 인덱스
 */
public class Ex9461 {
    static long[] arr = new long[101];
    public static void main(String[] args) throws IOException {
        arr[0] = 0;
        arr[1] = arr[2] = arr[3] = 1;
        arr[4] = arr[5] = 2;
        for (int i = 6; i <= 100; i++) {
            arr[i] = -1;
        }

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            sb.append(findWaveSequence(N)).append("\n");
        }
        System.out.println(sb);
    }

    private static long findWaveSequence(int n) {
        if (arr[n] == -1) {
            arr[n] = findWaveSequence(n - 1) + findWaveSequence(n - 5);
        }
        return arr[n];
    }
}
