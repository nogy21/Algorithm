package basic.dfsnbfs;

import java.io.*;

/**
 * N-Queen(https://www.acmicpc.net/problem/9663)
 * 2차원 배열이 아닌 1차원 배열 사용
 */
public class Ex9663_2 {
    private static int n, cnt;
    private static int[] arr;

    /**
     * 각 행에는 하나의 퀸이 위치할 수 있으므로 2차원 배열이 아닌 1차원 배열로도 표현이 가능하다
     * 한 행에 하나의 값만 존재하므로, 일차원 배열의 인덱스는 행을, 값은 열을 나타낼 수 있다
     * ex) 일차원 배열 [2,4,1,3]
     *     이차원 배열 [(1,2), (2,4), (3,1), (4,3)]    (이해를 돕기 위해 0이 아닌 1부터 표기하였음)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        bt(0);
        System.out.println(cnt);
    }

    private static void bt(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            // 이동가능 여부 확인 후 dfs 수행
            if (checkUsablePlace(depth)) {
                bt(depth + 1);
            }
        }
    }

    private static boolean checkUsablePlace(int col) {
        // 같은 열이나 대각선에는 위치할 수 없다
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            // 행의 차와 열의 차가 같은 경우 대각선에 위치
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
