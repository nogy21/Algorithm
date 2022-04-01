package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 단지번호붙이기(https://www.acmicpc.net/problem/2667)
 */
public class Ex2667_3 {
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static Queue<Node> q = new LinkedList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    visit[i][j] = true;
                    bfs(new Node(i, j));
                }
            }
        }
        Collections.sort(list);

        System.out.println(list.size());
        for (Integer val : list) {
            System.out.println(val);
        }
    }
    static void bfs(Node node) {
        q.offer(node);
        int size = 1;

        while (!q.isEmpty()) {
            Node curNode = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = curNode.x + dx[i];
                int y = curNode.y + dy[i];

                if (x < 0 || y < 0 || x >= N || y >= N) {
                    continue;
                }

                if (map[x][y] == 1 && !visit[x][y]) {
                    visit[x][y] = true;
                    size++;
                    q.offer(new Node(x, y));
                }
            }
        }
        list.add(size);
    }

    static class Node{
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
