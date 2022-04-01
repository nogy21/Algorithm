package basic.dfsnbfs;

import java.io.*;
import java.util.*;
/**
 * 유기농 배추(https://www.acmicpc.net/problem/1012)
 */

public class Ex1012 {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 1 <= M, N <= 50, 1 <= K <= 2500
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken()); // 위치 개수
            int cnt = 0;

            map = new int[N][M];
            visit = new boolean[N][M];

            // 배추 입력
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        visit[i][j] = true;
                        cnt++;
                        bfs(new Node(i, j));
                    }
                }
            }
            sb.append(cnt).append("\n");
        } // while

        System.out.print(sb);
    }

    private static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            Node curNode = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = curNode.getX() + dx[i];
                int y = curNode.getY() + dy[i];

                if (x < 0 || y < 0 || x >= N || y >= M) {
                    continue;
                }

                if (map[x][y] == 1 && !visit[x][y]) {
                    visit[x][y] = true;
                    q.offer(new Node(x, y));
                }
            }
        }
    }

    private static class Node {
        public int x, y;

        public Node(int x, int y) {
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
}
