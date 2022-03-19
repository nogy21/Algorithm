package basic.implementation;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 로봇 청소기 (https://www.acmicpc.net/problem/14503)
 * 아이디어
 * : 네 방향 모두 이미 청소 or 벽 && 뒤쪽도 벽일 때 까지 반복
 *      1. 현재 위치를 청소
 *      2. 현재 위치에서 현재 방향을 기준 왼쪽부터 탐색
 *      2-a   왼쪽 방향 아직 청소 X -> 왼쪽으로 회전 & 한 칸 전진 -> 1번으로
 *      2-b   왼쪽 방향 청소 불가 -> 왼쪽으로 회전 -> 2번으로
 *      2-c 네 방향 모두 이미 청소 O or 벽 -> 바라보는 방향을 유지 & 1칸 후진 -> 2번으로
 *      2-d (네 방향 모두 이미 청소 O or 벽) & 뒤쪽 방향 벽 -> end
 *  시간복잡도
 *  : O(NM) -> 50 * 50
 */
public class Ex14503 {
    static int N, M;
    static int[][] map; // 0: 청소X, 1: 벽, 2: 청소O
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 세로
        M = Integer.parseInt(st.nextToken()); // 가로
        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()); // (r,c)
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); // 0: 북, 1: 동, 2: 남, 3: 서

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clean(r, c, d);

        System.out.println(cnt);
    }

    private static void clean(int r, int c, int d) {
            // 1 현재 위치 청소
            if (map[r][c] == 0) {
                map[r][c] = 2;
                cnt++;
            }

            // 2 왼쪽부터 탐색
            for (int i = 0; i < 4; i++) {
                // 2-b
                d = (d + 3) % 4;
                int nx = r + dx[d];
                int ny = c + dy[d];

                // 2-a
                if (isIn(nx, ny) && map[nx][ny] == 0) {
                    clean(nx, ny, d);
                    return;
                }
            }

            // for loop 탈출 -> 2-c, 2-d
            int bd = (d + 2) % 4; // 뒤로
            int bx = r + dx[bd];
            int by = c + dy[bd];

            if (isIn(bx,by) && map[bx][by] != 1) {
                clean(bx, by, d); // 방향은 원래 방향
            }
    }

    private static boolean isIn(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
