package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 벽 부수고 이동하기
 *
 * 아이디어
 * : 벽을 한 번씩 부수고 최단거리 탐색 => 시간 내 탐색 불가
 *
 * - 벽을 부수지 않은 상태와 부순 상태에서의 방문을 구분
 *  - 시작점에서 x까지 벽을 0 or 1개 부순 방문을 k => visited[k][x]
 *  - 벽을 부수지 않았다면
 *   - 벽 O -> 부숨, 노드에 부순 상태 저장
 *   - 벽 X -> 진행
 *  - 벽을 이미 부쉈다면
 *   - 벽 O -> 패스
 *   - 벽 X -> 진행, 다음 노드에 현재 노드 상태 저장
 *
 * 시간복잡도
 * : 벽을 한 번씩 부수고 최단거리 탐색 => O(NM * NM) = 1,000,000,000,000 => 불가
 * - 벽을 부수지 않는 탐색 + 벽을 부순 탐색 => O(2*N*M) => O(N*M)
 */
public class Ex2206 {
    static char[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        visited = new boolean[2][n][m];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        bfs();

        System.out.println(-1);
    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0, 1, false));
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            Node currNode = q.poll();

            if (currNode.x == n - 1 && currNode.y == m - 1) {
                System.out.println(currNode.dist);
                System.exit(0);
            }

            for (int i = 0; i < 4; i++) {
                int nx = currNode.x + dx[i];
                int ny = currNode.y + dy[i];

                if (!isIn(nx, ny)) continue;

                // 벽 아직 부수지 않은 경우
                if (!currNode.hasBroken) {
                    if (visited[0][nx][ny]) {
                        continue;
                    }
                    // 벽인지 판단하여 방문 처리
                    visited[map[nx][ny] - '0'][nx][ny] = true;
                    boolean isWall = map[nx][ny] == '1';
                    q.offer(new Node(nx, ny, currNode.dist + 1, isWall));

                } else { // 벽 이미 부순 경우
                    if (map[nx][ny] == '1' || visited[1][nx][ny]) {
                        continue;
                    }
                    visited[1][nx][ny] = true;
                    q.offer(new Node(nx, ny, currNode.dist + 1, true));
                }
            }
        }
    }

    private static class Node {
        int x, y, dist;
        boolean hasBroken;

        public Node(int x, int y, int dist, boolean hasBroken) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.hasBroken = hasBroken;
        }
    }

    private static boolean isIn(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

}
