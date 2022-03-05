package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 치즈(https://www.acmicpc.net/problem/2638) - bfs
 * 4변 중 2변 이상이 공기와 접촉한 것은 한 시간 내에 없어진다
 * -> bfs 탐색을 하며 치즈 좌표에 +1, 치즈의 값이 1이므로 3 이상 체크된 치즈는 삭제
 */
public class Ex2638 {
    static int n, m;
    static int[] dx = {1, -1, 0, 0,};
    static int[] dy = {0, 0, 1, -1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = 0;
        while (true) {
            bfs(0, 0);

            // 치즈를 만나면 cnt 증가 후 공기로 바꿈
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] >= 3) {
                        map[i][j] = 0;
                        cnt++;
                    }
                    if (map[i][j] == 2) { // 한 면만 만난 경우 1로 초기화
                        map[i][j] = 1;
                    }
                }
            }
            if (cnt == 0) {
                break;
            }
            time++;
        }
        System.out.println(time);
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited = new boolean[n][m];
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            int currX = p.x, currY = p.y;

            for (int i = 0; i < 4; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                // 치즈를 만난 경우
                if (map[nx][ny] >= 1) {
                    map[nx][ny]++;
                }

                if (!visited[nx][ny] && map[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
