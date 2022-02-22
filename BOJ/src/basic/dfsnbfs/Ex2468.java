package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 안전 영역(https://www.acmicpc.net/problem/2468)
 */
public class Ex2468 {

    public static int N;
    public static int[][] graph;
    public static boolean[][] visited;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1][N + 1];
        graph = new int[N + 1][N + 1];
        int maxHeight = 0;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, graph[i][j]);
            }
        }

        int result = 0;
        for (int i = 1; i <= maxHeight; i++) {
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (!visited[j][k] && graph[j][k] >= i) {
                        cnt++;
                        dfs(j, k, i);
                    }
                }
            }
            for (boolean[] booleans : visited) {
                Arrays.fill(booleans, false);
            }
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }

    public static void dfs(int x, int y, int h) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || ny < 1 || nx > N || ny > N) {
                continue;
            }

            if (!visited[nx][ny] && graph[nx][ny] >= h) {
                dfs(nx, ny, h);
            }
        }
    }
}
