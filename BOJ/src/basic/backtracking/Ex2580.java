package basic.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스도쿠 (https://www.acmicpc.net/problem/2580)
 * : 같은 행, 열에 겹치지 않으면서 3x3 공간에서도 1~9 사이의 숫자가 하나씩 존재
 * <p>
 * 아이디어
 * : 큐에 정답이 필요한 위치 저장 후 아래 사항 확인
 * 1. 같은 행에 1 ~ 9 확인
 * 2. 같은 열에 1 ~ 9 확인
 * 3. 같은 블록(3x3)에 1 ~ 9 확인
 */
public class Ex2580 {
    static int[][] map = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);
    }

    private static void sudoku(int row, int col) {
        // 행의 정답 모두 찾은 경우 다음 행으로
        if (col == 9) {
            sudoku(row + 1, 0);
            return;
        }

        // 정답 모두 찾은 경우 출력 후 종료
        if (row == 9) {
            printAnswer();
            System.exit(0);
        }

        // 정답 찾기
        if (map[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                // 사용 가능한 숫자인지 확인
                if (isUsableNum(row, col, i)) {
                    map[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            // 답을 더 이상 찾을 수 없는 경우(잘못된 답을 찾은 경우) 재귀를 통해 빠져나와 초기화
            map[row][col] = 0;
            return;
        }


        sudoku(row, col + 1);
    }

    private static boolean isUsableNum(int row, int col, int val) {
        // 행과 열 값 확인
        for (int i = 0; i < 9; i++) {
            // 같은 행 확인
            if (map[row][i] == val) {
                return false;
            }
            // 같은 열 확인
            if (map[i][col] == val) {
                return false;
            }
        }

        // 같은 블록 확인
        int firstValueOfRow = (row / 3) * 3;
        int firstValueOfCol = (col / 3) * 3;

        for (int i = firstValueOfRow; i < firstValueOfRow + 3; i++) {
            for (int j = firstValueOfCol; j < firstValueOfCol + 3; j++) {
                if (map[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printAnswer() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : map) {
            for (int val : row) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
