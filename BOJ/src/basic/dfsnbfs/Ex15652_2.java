package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M(4) (https://www.acmicpc.net/problem/15652)
 */
public class Ex15652_2 {
    private static int n, m;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(0, 1);
        System.out.println(sb);
    }

    private static void dfs(int depth, int beginWith) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = beginWith; i <= n; i++) {
            arr[depth] = i;
            dfs(depth + 1, i);
        }
    }
}
