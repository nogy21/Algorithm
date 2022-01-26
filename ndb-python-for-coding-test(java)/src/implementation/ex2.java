package implementation;

import java.util.Scanner;

/**
 * 시각
 * 첫째 줄에 정수 n이 입력 (0 <= n <= 23)
 * 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력
 * --------------
 * 입력 예시: 5
 * 출력 예시: 11475
 */
public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i <= hour; i++) {
            if (i == 3 || i == 13) {
                cnt += 3600;
                continue;
            }
            for (int j = 0; j < 60; j++) {
                if (j % 10 == 3 || j / 10 == 3) {
                    cnt += 60;
                    continue;
                }
                for (int k = 0; k < 60; k++) {
                    if (k % 10 == 3 || k / 10 == 3) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
