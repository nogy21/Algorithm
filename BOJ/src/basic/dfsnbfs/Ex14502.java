package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 연구소 (https://www.acmicpc.net/problem/14502)
 */
public class Ex14502 {
    private static int n, m, ans;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int[][] map, copy_map;
    private static Queue<Point> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        copy_map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                copy_map[i][j] = map[i][j];
            }
        }

        makeWall(0);
        System.out.println(ans);
    }

    private static void makeWall(int depth) {
        if (depth == 3) {
            copyMap();
            spreadVirus();
            countSafeArea();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    makeWall(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void countSafeArea() {
    }

    private static void copyMap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy_map[i][j] = map[i][j];
            }
        }
    }

    private static void spreadVirus() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy_map[i][j] == 2) {
                    q.add(new Point(i, j));
                }
            }
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            int x = p.getX();
            int y = p.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = 2;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
