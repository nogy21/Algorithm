package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 토마토 (https://www.acmicpc.net/problem/7576)
 * 아이디어 (bfs)
 * - 익은 토마토의 위치에서 모두 bfs 진행 => 익은 정도를 객체에 담아두고 Queue 에 넣어둠
 * - 인접한 토마토가 익을 때(방문) 카운트(익은 토마토 개수와 bfs 탐색 회수 별도로 저장) => 별도 저장 필요 X, 최대 값만 갱신
 * - bfs 종료 시, 익은 토마토 개수와 처음 입력받은 익지 않은 토마토 개수 비교
 *
 * 시간복잡도
 * : 2 <= M, N <= 1000
 * O(MN) == 1,000,000
 */
public class Ex7576 {
    static int M, N, days = 0, unripeTomatoes = 0;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Tomato> tomatoes = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        // 입력(익은: 1, 안 익은: 0, 없는: -1)
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int input = Integer.parseInt(st.nextToken());
                map[i][j] = input;

                if (input == 1) {
                    tomatoes.add(new Tomato(i, j, 1));
                } else if (input == 0) {
                    unripeTomatoes++;
                }
            }
        }

        bfs();

        // 안 익은 토마토 확인
        /*loop: for (int[] rows : map) {
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

            for (int i = 0; i < 4; i++) {
                int nx = tomato.getX() + dx[i];
                int ny = tomato.getY() + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if (map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    unripeTomatoes--;
                    tomatoes.offer(new Tomato(nx, ny, tomato.time + 1));
                }
            }
        }
    }

    private static class Tomato {
        int x, y, time;

        Tomato(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getTime() {
            return time;
        }
    }
}
