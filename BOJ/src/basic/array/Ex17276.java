package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 배열 돌리기(https://www.acmicpc.net/problem/17276)
 */
public class Ex17276 {
    private static int n, d;
    private static int[][] arr, copy;
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            if (d < 0) {
                d += 360;
            }
            d /= 45;

            // 배열 입력
            arr = new int[n][n];
            copy = new int[n][n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                    copy[j][k] = arr[j][k];
                }
            }

            while (d-- > 0) {
                turnArr();
            }

            storeArr();
        }
        System.out.println(sb);
    }

    private static void turnArr() {
        for (int i = 0; i < n; i++) {
            copy[i][n/2] = arr[i][i];
            copy[i][i] = arr[n/2][i];
            copy[n/2][i] = arr[n-i-1][i];
            copy[n-i-1][i] = arr[n-i-1][n/2];
        }
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = copy[i][j];
            }
        }
    }

    private static void storeArr() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
    }
}
