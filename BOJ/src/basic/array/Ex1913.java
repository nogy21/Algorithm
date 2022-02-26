package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 달팽이(https://www.acmicpc.net/problem/1913)
 */
public class Ex1913 {
    private static int n, targetNum;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        targetNum = Integer.parseInt(br.readLine());

        int at = n * n + 1; // 시작 숫자 + 1
        int s = 1; // 방향 전환

        int[][] arr = new int[n + 1][n + 1];
        int row = 0, col = 1;
        int k = n;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < k; j++) {
                at--;
                row = row + s;
                arr[row][col] = at;
            }
            k--;
            for (int j = 0; j < k; j++) {
                at--;
                col = col + s;
                arr[row][col] = at;
            }
            s *= -1;
        }

        printArr(arr);
    }

    private static void printArr(int[][] arr) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == targetNum) {
                    answer = i + " " + j;
                }
            }
            sb.append("\n");
        }
        sb.append(answer);
        System.out.println(sb);
    }
}
