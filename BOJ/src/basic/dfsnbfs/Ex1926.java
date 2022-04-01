package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 그림 (https://www.acmicpc.net/problem/1926)
 */
public class Ex1926 {
    static int n, m, numberOfPaintings = 0, maxSize = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    visit[i][j] = true;
                    bfs(new Node(i, j));
                }
            }
        }

        maxSize = maxSize < 0 ? 0 : maxSize;
        System.out.println(numberOfPaintings);
        System.out.println(maxSize);
    }

    public static void bfs(Node node) {
        numberOfPaintings++;
        int size = 1;

        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            Node curNode = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = curNode.x + dx[i];
                int y = curNode.y + dy[i];
                Node newNode = new Node(x, y);

                if (x < 0 || x >= n || y < 0 || y >= m) {
                    continue;
                }

                if (map[x][y] == 1 && !visit[x][y]) {
                    visit[x][y] = true;
                    size++;
                    q.offer(newNode);
                }
            }
        }

        maxSize = Math.max(maxSize, size);
    }

    private static class Node {
        public int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
