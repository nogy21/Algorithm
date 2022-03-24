package basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1, 2, 3 더하기 (https://www.acmicpc.net/problem/9095)
 * 아이디어
 * : A(1) = 1
 *   A(2) = 1 1,   1_A(1)          A(1) + 1
 *          2      2
 *   A(3) = 1 1 1, 1_A(2)          A(2) + A(1) + 1
 *           1 2,
 *          2 1,   2_A(1)
 *          3      3
 *   A(4) = 1 1 1 1,  ____ 1_A(3)  A(3) + A(2) + A(1)
 *           1 1 2,
 *           1 2 1,
 *           1 3,
 *          2 1 1,    ____ 2_A(2)
 *           2 2
 *          3 1,      ____ 3_A(1)
 *   A(5) = 1 1 1 1 1, ____ 1_A(4) A(4) + A(3) + A(2)
 *           1 1 1 2,
 *           1 1 2 1,
 *           1 1 3,
 *           1 2 1 1,
 *           1 2 2,
 *           1 3 1,
 *          2 1 1 1,   ____ 2_A(3)
 *           2 1 2,
 *           2 2 1,
 *           2 3,
 *          3 1 1,     ____3_A(2)
 *           3 2
 */
public class Ex9095 {
    static int[] arr = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i < 11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]).append("\n");
        }
        System.out.println(sb);
    }
}
