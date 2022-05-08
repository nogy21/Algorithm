package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 토마토 (https://www.acmicpc.net/problem/7569)
 * 아이디어 (bfs)
 * - 안 익은 토마토가 없으면 0 출력, 이 외의 경우 x, y, z 고려
 * - 익은 토마토의 위치에서 모두 bfs 진행 => 익은 정도를 객체에 담아두고 Queue 에 넣어둠
 * - 인접한 토마토가 익을 때(방문) 카운트(익은 토마토 개수와 bfs 탐색 회수 별도로 저장) => 별도 저장 필요 X, 최대 값만 갱신
 * - bfs 종료 시, 익은 토마토 개수와 처음 입력받은 익지 않은 토마토 개수 비교
 *
 * 시간복잡도
 * : 2 <= M, N, H <= 100
 * O(MN) == 1,000,000
 */
public class Ex7569 {
    static int M, N, H, days = 0, unripeTomatoes = 0;
    static int[][][] board;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Queue<Tomato> tomatoes = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        board = new int[H][N][M];

        // 입력(익은: 1, 안 익은: 0, 없는: -1)
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    int input = Integer.parseInt(st.nextToken());
                    board[i][j][k] = input;

                    if (input == 1) {
                        tomatoes.add(new Tomato(i, j, k, 1));
                    } else if (input == 0) {
                        unripeTomatoes++;
                    }
                }
            }
        }

        if (unripeTomatoes == 0) {
            System.out.println(0);
            System.exit(0);
        }
        bfs();

        // 안 익은 토마토 확인
        /*loop: for (int[] rows : board) {
            for (int val : rows) {
                if (val == 0) {
                    days = -1;
                    break loop;
                }
            }
        }*/

//        days = days == -1 ? -1 : days - 1;
        days = unripeTomatoes > 0 ? -1 : days - 1;
        System.out.println(days);
    }

    private static void bfs() {

        while (!tomatoes.isEmpty()) {
            Tomato tomato = tomatoes.poll();
            days = Math.max(days, tomato.time);

            for (int i = 0; i < 6; i++) {
                int nx = tomato.getX() + dx[i];
                int ny = tomato.getY() + dy[i];
                int nz = tomato.getZ() + dz[i];

                if (nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H) {
                    continue;
                }

                if (board[nz][nx][ny] == 0) {
                    board[nz][nx][ny] = 1;
                    unripeTomatoes--;
                    tomatoes.offer(new Tomato(nz, nx, ny, tomato.time + 1));
                }
            }
        }
    }

    private static class Tomato {
        int x, y, z, time;

        Tomato(int z, int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.time = time;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() { return z;}

        public int getTime() {
            return time;
        }
    }
}
