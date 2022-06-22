package basic.dividenconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 종이의 개수 (https://www.acmicpc.net/problem/1780)
 * : N×N크기의 행렬로 표현되는 종이가 있다. 종이의 각 칸에는 -1, 0, 1 중 하나가 저장되어 있다. 우리는 이 행렬을 다음과 같은 규칙에 따라 적절한 크기로 자르려고 한다.
 *  1) 만약 종이가 모두 같은 수로 되어 있다면 이 종이를 그대로 사용한다.
 *  2) (1)이 아닌 경우에는 종이를 같은 크기의 종이 9개로 자르고, 각각의 잘린 종이에 대해서 (1)의 과정을 반복한다.
 *  이와 같이 종이를 잘랐을 때, -1로만 채워진 종이의 개수, 0으로만 채워진 종이의 개수, 1로만 채워진 종이의 개수를 구해내는 프로그램을 작성하시오.
 *
 * 아이디어
 * : 분할 정복. 전체 범위부터 시작하여 다른 값이 나올 경우 가로, 세로 1/3씩 나눠 진행.
 */
public class Ex1780 {
    static int[][] board;
    static int negative = 0;
    static int zero = 0;
    static int positive = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            String temp[] = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(temp[j]);
            }
        }

        divide(0, 0, N);
        System.out.println(negative);
        System.out.println(zero);
        System.out.println(positive);
    }

    private static void divide(int row, int col, int size) {
        if (isSameNumber(row, col, size)) {
            switch (board[row][col]) {
                case -1:
                    negative++;
                    return;
                case 0:
                    zero++;
                    return;
                case 1:
                    positive++;
                    return;
            }
        }

        size /= 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(row + size * i, col + size * j, size);
            }
        }
    }

    private static boolean isSameNumber(int row, int col, int size) {
        int num = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != num) {
                    return false;
                }
            }
        }
        return true;
    }
}
