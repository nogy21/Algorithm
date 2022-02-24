package basic.dfsnbfs;

import java.util.Scanner;

/**
 * N-Queen(https://www.acmicpc.net/problem/9663)
 */
public class Ex9663 {
    private static int n, cnt;
    private static boolean[][] arr, visit;

    /**
     * 퀸은 한 줄과 한 열, 그리고 대각선 모두를 공격 범위로 가진다
     * N x N 크기의 판에서 N개의 퀸을 놓기 위해서는 한 행마다 하나의 퀸이 존재
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new boolean[n][n];
        visit = new boolean[n][n];

        dfs(0);
        System.out.println(cnt);
    }

    private static void dfs(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[depth][i]) {
                visit[depth][i] = true;
                arr[depth][i] = true;

                // 이동반경 처리
                checkUnusablePlace(depth, i);

                dfs(depth + 1);

                // 이전 상태로
                arr[depth][i] = false;
                init_visit();

                // 모든 방문을 초기화 했으므로 이전에 놓은 퀸의 위치 복원
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (arr[j][k]) {
                            checkUnusablePlace(j, k);
                        }
                    }
                }
            }
        }
    }

    private static void checkUnusablePlace(int x, int y) {
        // 퀸이 위치한 행부터 위로는 체크하지 않으므로
        // 아래 방향, 아래쪽의 양쪽 대각선을 확인
        for (int i = x + 1; i < n; i++) {
            visit[i][y] = true;
        }
        int nx = x, ny = y;
        while (0 <= nx && nx < n && 0 <= ny && ny < n) {
            visit[nx++][ny--] = true;
        }
        while (0 <= x && x < n && 0 <= y && y < n) {
            visit[x++][y++] = true;
        }
    }

    private static void init_visit() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visit[i][j] = false;
            }
        }
    }
}
