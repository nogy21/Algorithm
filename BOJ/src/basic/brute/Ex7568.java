package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][n];
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
        }
        int[] list = new int[n];
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int k = 0; k < n; k++) {
                if (arr[0][j] == arr[0][k] || arr[1][j] == arr[1][k])
                    continue;
                else if (arr[0][j] < arr[0][k] && arr[1][j] < arr[1][k])
                    count++;
            }
            list[j] = count;
        }
        for (int l = 0; l < n; l++) {
            System.out.println(list[l] + 1);
        }
    }
}
