package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 다리 만들기(https://www.acmicpc.net/problem/2146)
 * 풀이 참고(https://www.youtube.com/watch?v=2bY5l8V6ggo)
 */
public class Ex2146 {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int idOfIsland = n * n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((map[i][j] < idOfIsland) && (map[i][j] != 0)) {
                    setIdOfIsland(i, j, map[i][j], idOfIsland);
                    idOfIsland--;
                }
            }
        }

        int res = solve();
        System.out.println(res);
    }

    private static void setIdOfIsland(int sx, int sy, int orgId, int idOfIsland) {
        Deque<int[]> que = new ArrayDeque<>();
        que.add(new int[]{sx, sy});
        visited[sx][sy] = true;

        while (que.size() > 0) {
            int[] xy = que.pop();
            int x = xy[0];
            int y = xy[1];

            map[x][y] = idOfIsland;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (!isMovable(nx, ny)) continue;
                if ((!visited[nx][ny]) && (map[nx][ny] == orgId)) {
                    que.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private static boolean isMovable(int x, int y) {
        return (x >= 0) && (x < n) && (y >= 0) && (y < n);
    }

    private static int solve() {
        int ret = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0) {
                    int tmp = floodFillWithoutRecursion(i, j, map[i][j]);
                    if (tmp > 0) {
                        ret = Math.min(ret, tmp);
                    }
                }
            }
        }
        return ret;
    }

    private static int floodFillWithoutRecursion(int sx, int sy, int fromId) {
        int lenOfBridge = 0;
        initArr(visited, false);

        Deque<int[]> que = new ArrayDeque<>();
        que.add(new int[]{sx, sy});
        visited[sx][sy] = true;

        while (que.size() > 0) {
            int s = que.size();
            for (int i = 0; i < s; i++) {
                int[] xy = que.pop();
                int x = xy[0];
                int y = xy[1];

                visited[x][y] = true;

                if ((map[x][y] > 0) && (map[x][y] != fromId)) {
                    return (lenOfBridge - 1);
                }

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (!isMovable(nx, ny)) continue;

                    if ((!visited[nx][ny]) && (map[nx][ny] != fromId)) {
                        que.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            } // for (int i = 0; i < que.size(); i++) {
            lenOfBridge++;
        } // while (que.size() > 0) {
        return (lenOfBridge - 1);
    }

    private static void initArr(boolean[][] _2D, boolean v) {
        for (boolean[] _1D : _2D) {
            Arrays.fill(_1D, v);
        }
    }
}
