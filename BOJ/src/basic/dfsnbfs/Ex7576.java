package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 토마토 (https://www.acmicpc.net/problem/7576)
 * 아이디어 (bfs)
 * - 익은 토마토의 위치에서 모두 bfs 진행
 * - 인접한 토마토가 익을 때(방문) 카운트(익은 토마토 개수와 bfs 탐색 회수 별도로 저장)
 * - bfs 종료 시, 익은 토마토 개수와 처음 입력받은 익지 않은 토마토 개수 비교
 *
 * 시간복잡도
 * : 2 <= M, N <= 1000
 * O(MN) == 1,000,000
 */
public class Ex7576 {
    static int M, N, unripeTomato = 0, ripeTomato = 0, days = 0;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];

        ArrayList<Node> ripeFruits = new ArrayList<>();
        // 입력(익은: 1, 안 익은: 0, 없는: -1)
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) {
                    unripeTomato++;
                } else if (map[i][j] == 1) {
                    ripeFruits.add(new Node(i, j));
                    visit[i][j] = true;
                }
            }
        }

        bfs(ripeFruits);

        days = unripeTomato != ripeTomato ? -1 : days - 1;
        System.out.println(days);
    }

    private static void bfs(ArrayList<Node> ripeFruits) {
        Queue<Node> q = new LinkedList<>();
        int len = ripeFruits.size();
        for (int i = 0; i < len; i++) {
            q.offer(ripeFruits.get(i));
        }

        ripeFruits = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            days++;

            for (int i = 0; i < size; i++) {
                ripeFruits.add(q.poll());
            }

            for (int i = 0; i < 4; i++) {
                int[] nx = new int[size];
                int[] ny = new int[size];

                for (int j = 0; j < size; j++) {
                    nx[j] = ripeFruits.get(j).getX() + dx[i];
                    ny[j] = ripeFruits.get(j).getY() + dy[i];

                    if (nx[j] < 0 || ny[j] < 0 || nx[j] >= N || ny[j] >= M) {
                        continue;
                    }

                    if (map[nx[j]][ny[j]] == 0 && !visit[nx[j]][ny[j]]) {
                        map[nx[j]][ny[j]] = 1;
                        visit[nx[j]][ny[j]] = true;
                        ripeTomato++;
                        q.offer(new Node(nx[j], ny[j]));
                    }
                }
            }

            ripeFruits = new ArrayList<>();
        }
    }

    private static class Node {
        int x, y;

        Node(int x, int y) {
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
