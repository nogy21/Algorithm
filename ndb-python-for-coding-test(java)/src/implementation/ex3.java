package implementation;

import java.util.Scanner;

/**
 * 왕실의 나이트
 * 8 x 8 좌표 평면의 특정한 한 칸에 나이트가 서 있다.
 * 나이트는 아래의 2가지 경우로 이동할 수 있다.
 * 1. 수평으로 두 칸 이동한 뒤 수직으로 한 칸 이동
 * 2. 수직으로 두 칸 이동한 뒤 수평으로 한 칸 이동
 * 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램을 작성하라.
 * <p>
 * 현재 나이트가 위치한 곳의 좌표를 나타내느 두 문자로 구성된 문자열이 입력된다.
 * (입력 문자는 a1처럼 열과 행으로 이뤄진다)
 * -----------
 * 입력 예시: a1
 * 출력 예시: 2
 */
public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int boardSize = 8;
        // 현재 위치 입력받기
        int row = input.charAt(1) - '1';
        int col = input.charAt(0) - 'a';
        // 이동 경로
        int[] dx = {-1, 1, 2, 2, 1, -1, -2, -2};
        int[] dy = {2, 2, 1, -1, -2, -2, -1, 1};

        // 이동 가능한 경우의 수
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int destRow = row + dx[i];
            int destCol = col + dy[i];
            if (destRow >= 0 && destRow < boardSize && destCol >= 0 && destCol < boardSize) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

}
