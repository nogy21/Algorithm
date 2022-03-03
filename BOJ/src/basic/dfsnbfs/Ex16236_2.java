package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 아기 상어(https://www.acmicpc.net/problem/16236)
 */
public class Ex16236_2 {
    static int n;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] map = new int[20][20];
    static final int INF = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int startRow = 0, startCol = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) { // 상어 시작 위치
                    startRow = i;
                    startCol = j;
                    map[startRow][startCol] = 0;
                }
            }
        }
        System.out.println(solve(startRow, startCol));
    }

    static int solve(int x, int y) {
        int ret = 0;
        int size = 2, cnt = 2; // size: 상어 크기, cnt: 0이 되면 size 증가
        Point p = new Point(x, y, 0);

        do {
            boolean[][] visited = new boolean[20][20];
            Queue<Point> q = new LinkedList<Point>();
            visited[p.x][p.y] = true;
            q.offer(new Point(p.x, p.y, 0));
            p.d = INF; // 최단거리 탐색을 위해 최대값으로 초기화

            while (!q.isEmpty()) {
                Point curr = q.poll();

                // 최단거리보다 큰 경우
                if (curr.d > p.d) break;
                // 물고기의 크기가 상어보다 큰 경우
                if (map[curr.x][curr.y] > size) continue;
                // 먹기 가능
                if (map[curr.x][curr.y] != 0 && map[curr.y][curr.y] < size) {
                    if (curr.d < p.d) {
                        p = curr;
                    } else if (curr.d == p.d) { // 같은 거리인 경우 우선 탐색 순위
                        if (curr.x < p.x) {
                            p = curr;
                        } else if (curr.x == p.x && curr.y < p.y) {
                            p = curr;
                        }
                    }
                    continue;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = curr.x + dx[i], ny = curr.y + dy[i];
                    // 맵을 벗어나는 경우
                    if (nx < 0 || nx > n - 1 || ny < 0 || ny > n - 1) continue;
                    // 이미 q에 적재된 경우
                    if (visited[nx][ny]) continue;
                    visited[nx][ny] = true;
                    q.offer(new Point(nx, ny, curr.d + 1));
                }
            }

            if (p.d != INF) {
                ret += p.d;
                cnt--;
                if (cnt == 0) {
                    size++;
                    cnt = size;
                }
                map[p.x][p.y] = 0;
            }
        } while (p.d != INF); // 물고기를 찾지 못 한 경우 종료

        return ret;
    }

    static class Point {
        int x, y, d; // 행, 열, 거리
        Point(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

}
