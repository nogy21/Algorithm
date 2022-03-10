package basic.segment;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기 5 (https://www.acmicpc.net/problem/11660)
 */
public class Ex11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] prefixSum = new int[n + 1][n + 1];

        int tmp;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                tmp = Integer.parseInt(st.nextToken());
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + tmp;
            }
        }

        int sX, sY, eX, eY;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            sX = Integer.parseInt(st.nextToken());
            sY = Integer.parseInt(st.nextToken());
            eX = Integer.parseInt(st.nextToken());
            eY = Integer.parseInt(st.nextToken());

            tmp = prefixSum[eX][eY] - prefixSum[sX - 1][eY] - prefixSum[eX][sY - 1] + prefixSum[sX - 1][sY - 1];
            sb.append(tmp).append("\n");

            /*sb.append(prefixSum[sX][sY]).append(" ")
                    .append(prefixSum[eX][eY]).append(" ")
                    .append(prefixSum[eX][sY - 1]).append(" ")
                    .append(prefixSum[sX - 1][eY]).append("\n");*/
        }
        System.out.println(sb);
    }
}
