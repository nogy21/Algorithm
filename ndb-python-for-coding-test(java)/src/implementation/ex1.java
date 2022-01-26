package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 상하좌우
 * N x N 크기의 정사각형 공간, 1 x 1 커기의 정사각형으로 나누어져 있음
 * 가장 왼쪽 위 좌표는 (1,1), 가장 오른쪽 아래 좌표는 (N,N)
 * 여행가 A는 상, 하, 좌, 우 방향으로 이동 가능하며 시작 좌표는 항상 (1,1)
 * 계획서에 따라 최종 좌표를 출력 (정사각형 공간을 벗어나는 움직임은 무시)
 * <p>
 * 첫째 줄에 공간의 크기를 나타내는 N이 주어짐(1 <= N <= 100)
 * 둘째 줄에 여행가 A가 이동할 계획서가 주어짐(1 <= 이동 횟수 <= 100)
 * <p>
 * ex) 5
 * R R R U D D
 * -----------
 * 결과값: 3 4
 */
public class ex1 {

    // U, D, L, R
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static char[] moveDirection = {'U', 'D', 'L', 'R'};
    private static int my_x = 1, my_y = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int map_size = sc.nextInt();
        sc.nextLine();
        String[] movePlan = sc.nextLine().split(" ");
        for (int i = 0; i < movePlan.length; i++) {
            int tmp_x = -1, tmp_y = -1;
            char plan = movePlan[i].charAt(0);
            for (int j = 0; j < 4; j++) {
                if (plan == moveDirection[j]) {
                    tmp_x = my_x + dx[j];
                    tmp_y = my_y += dy[j];
                }
            }
            if (tmp_x < 1 || tmp_y < 1 || tmp_x > map_size || tmp_y > map_size) {
                continue;
            }
            my_x = tmp_x;
            my_y = tmp_y;
        }

        System.out.println(my_x + " " + my_y);

    }

}
