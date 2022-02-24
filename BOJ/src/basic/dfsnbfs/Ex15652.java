package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M(4) (https://www.acmicpc.net/problem/15652)
 */
public class Ex15652 {
    private static int n, m;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m + 1];
        dfs(1);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth > m) {
            for (int i = 1; i <= m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            if (arr[depth] < arr[depth - 1]) {
                continue;
            }
            dfs(depth + 1);
        }
    }
}
