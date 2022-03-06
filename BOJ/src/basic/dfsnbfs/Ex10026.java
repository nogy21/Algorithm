package basic.dfsnbfs;

import java.io.*;

/**
 * 적록색약 (https://www.acmicpc.net/problem/10026) - DFS
 * 1. 아이디어
 * - 2중 for, 방문 X => DFS, 방문 처리 및 상하좌우로 탐색하며 색이 일치하는 칸에 DFS 진행
 * - DFS 종료 후 현재 칸이 R인 경우 G로 변경
 * - 방문 초기화 후 다시 DFS 탐색
 *
 * 2. 시간복잡도
 * - DFS: O(V+E)
 * - V, E: N^2 + N^2 + N^2 + N^2, 4N^2 + 4N^2
 * - V+E: 12 * N^2 = 120000 >> 가능
 *
 * 3. 자료구조
 * - 그래프 저장: int[][]
 * - 방문여부: boolean[][]
 */
public class Ex10026 {
    static int n;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];
        int normal_cnt = 0, abnormal_cnt = 0;

        // 입력
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = (char) (str.charAt(j));
            }
        }

        // 정상 DFS 후 색 변환
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    normal_cnt++;
                }
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }


        // 색 변환 후 DFS
        visited = new boolean[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    abnormal_cnt++;
                }
            }
        }
        System.out.println(normal_cnt + " " + abnormal_cnt);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        char color = map[x][y];
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx > n || ny < 0 || ny > n) continue;
            if (!visited[nx][ny] && map[nx][ny] == color) {
                dfs(nx, ny);
            }
        }
    }
}
