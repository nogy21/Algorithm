package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 알파벳 (https://www.acmicpc.net/problem/1987)
 * 1. 아이디어 DFS
 * - 2중 for, 지금까지 방문한 알파벳이 아닌 경우에만 DFS 탐색
 *
 * 2. 시간복잡도
 * - DFS: O(V+E)
 * - V, E: N^2 + 26^2, 4N^2
 * - V+E: 4N^4 = 160000 + 500 >> 가능
 *
 * 3. 자료구조
 * - 그래프 저장: char[][]
 * - 방문여부: int[]
 */
public class Ex1987 {
    static int r, c, result = 0;
    static char[][] map;
    static int[] visited = new int[26];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r + 1][c + 1];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = (char)str.charAt(j);
            }
        }

        int startAlphabet = map[0][0] - 'A';
        visited[startAlphabet]++;

        dfs(0, 0, 1);

        System.out.println(result);
    }

    private static void dfs(int x, int y, int cnt) {
        result = Math.max(result, cnt);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                continue;
            }

            int nextAlphabet = map[nx][ny] - 'A';
            if (visited[nextAlphabet] == 0) {
                visited[nextAlphabet] = 1;
                dfs(nx, ny, cnt + 1);
                visited[nextAlphabet] = 0;
            }
        }
    }
}
