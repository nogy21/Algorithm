package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 아기 상어(https://www.acmicpc.net/problem/16236)
 */
public class Ex16236 {
    static final int INF = 987654321;
    static int n;
    static int[][] map = new int[20][20];
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int srow = 0, scol = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    srow = i;
                    scol = j;
                    map[i][j] = 0;
                }
            }
        }

        System.out.println(solve(srow, scol));

    }

    static int solve(int r, int c) {
        int ret = 0;
        int size = 2, cnt = 2;
        Point minPt = new Point(r, c, 0);

        do {
            boolean visited[][] = new boolean[20][20];
            Queue<Point> myqueue = new LinkedList<Point>();
            visited[minPt.r][minPt.c] = true;
            myqueue.add(new Point(minPt.r, minPt.c, 0));
            minPt.d = INF;

            while (myqueue.peek() != null) {
                Point curr = myqueue.poll();

                if (curr.d > minPt.d) break;
                if (map[curr.r][curr.c] > size) {
                    continue;
                }
                if (map[curr.r][curr.c] != 0 && map[curr.r][curr.c] < size) {
                    if (curr.d < minPt.d) {
                        minPt = curr;
                    } else if (curr.d == minPt.d) {
                        if (curr.r < minPt.r) {
                            minPt = curr;
                        } else if (curr.r == minPt.r && curr.c < minPt.c) {
                            minPt = curr;
                        }
                    }
                    continue;
                }

                for (int i = 0; i < 4; i++) {
                    int nr = curr.r + dr[i], nc = curr.c + dc[i];
                    if (nr < 0 || nr > n - 1 || nc < 0 || nc > n - 1) {
                        continue;
                    }
                    if (visited[nr][nc]) {
                        continue;
                    }
                    visited[nr][nc] = true;
                    myqueue.add(new Point(nr, nc, curr.d + 1));
                }
            }

            if (minPt.d != INF) {
                ret += minPt.d;
                cnt--;
                if (cnt == 0) {
                    size++;
                    cnt = size;
                }
                map[minPt.r][minPt.c] = 0;
            }
        } while (minPt.d != INF);

        return ret;
    }

    static class Point {
        int r, c, d;
        Point(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }

}
