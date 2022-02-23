package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M(3) (https://www.acmicpc.net/problem/15651)
 * char[] 사용
 */
public class Ex15651_2 {
    private static int n, m;
    private static char[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[m * 2 + 1];
        for (int i = 1; i < m * 2; i += 2) {
            arr[i] = ' ';
        }
        arr[m * 2] = '\n';

        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == m) {
            sb.append(arr);
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[depth * 2] = (char)(i + '0');
            dfs(depth + 1);
        }
    }
}
