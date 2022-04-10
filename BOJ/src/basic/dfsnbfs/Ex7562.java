package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 나이트의 이동(https://www.acmicpc.net/problem/7562)
 * <p>
 * 나이트의 이동 방식은 8가지, 최소 횟수로 구하기 위해 BFS 진행하며 이미 이동안 곳은 방문 처리
 */
public class Ex7562 {
    static int[][] visited;
    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            // 체스판 크기(line * line)
            int line = Integer.parseInt(br.readLine());
            visited = new int[line][line];

            // 시작 위치
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Node start = new Node(x, y);

            // 목표 위치
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            Node dest = new Node(x, y);

            bfs(start, dest);
            sb.append(visited[dest.x][dest.y] - 1).append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(Node start, Node dest) {
        Queue<Node> q = new LinkedList<>();
        q.offer(start);
        visited[start.x][start.y] = 1;

        while (!q.isEmpty()) {
            Node currNode = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = currNode.x + dx[i];
                int ny = currNode.y + dy[i];

                if (!isIn(nx, ny)) {
                    continue;
                }

                if (visited[nx][ny] != 0) {
                    continue;
                }

                visited[nx][ny] = visited[currNode.x][currNode.y] + 1;
                if (nx == dest.x && ny == dest.y) {
                    return;
                }
                q.offer(new Node(nx, ny));
            }
        }
    }

    private static boolean isIn(int x, int y) {
        return x >= 0 && x < visited.length && y >= 0 && y < visited.length;
    }

    public static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
