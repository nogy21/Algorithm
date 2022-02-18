package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 사다리 조작(https://www.acmicpc.net/problem/15684)
 */
public class Ex15684 {
    private static int n, m, h;
    private static int answer = -1;
    private static int[][] map;
    private static boolean finish = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 세로선 개수
        m = Integer.parseInt(st.nextToken()); // 가로선 개수
        h = Integer.parseInt(st.nextToken()); // 세로선에 가로선을 놓을 수 있는 위치의 개수

        map = new int[h + 1][n + 1];

        // 사다리 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = 1; // 오른쪽으로 연결
            map[x][y + 1] = -1; // 왼쪽으로 연결
        }

        // 사다리를 놓을 수 있는 총 개수는 3개
        for (int i = 0; i <= 3; i++) {
            dfs(0, i);
        }

        System.out.println(answer);
    }

    private static void dfs(int currDepth, int depth) {
        if (currDepth == depth) {
            if (isAbleToPutLadder()) {
                System.out.println(depth);
                System.exit(0);
            }
            return;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0 || map[i][j + 1] > 0) {
                    continue;
                }
                map[i][j] = 1;
                map[i][j + 1] = -1;
                dfs(currDepth + 1, depth);
                map[i][j] = 0;
                map[i][j + 1] = 0;
            }
        }
    }

    private static boolean isAbleToPutLadder() {
        boolean res = true;
        for (int i = 0; i <= n; i++) {
            int cur_x = 1;
            int cur_y = i;

            while (cur_x < h + 1) {
                if (map[cur_x][cur_y] > 0) {
                    cur_y++;
                } else if (map[cur_x][cur_y] < 0) {
                    cur_y--;
                }
                cur_x++;
            }
            if (cur_y != i) {
                res = false;
                break;
            }
        }
        return res;
    }
}
