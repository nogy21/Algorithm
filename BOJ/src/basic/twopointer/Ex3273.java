package basic.twopointer;

import java.io.IOException;
import java.util.Scanner;

/**
 * 두 수의 합 (https://www.acmicpc.net/problem/3273)
 * : n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다.
 *  ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
 *  자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * : 첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다.
 *  (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
 *
 * 출력
 * : 문제의 조건을 만족하는 쌍의 개수를 출력한다.
 *
 * 아이디어
 * : 투포인터
 */
public class Ex3273 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = scan.nextInt();

        int a = 0;
        int cnt = 0;
        for (int i = 0; i < T - 1; i++) {
            for (int j = 1 + a; j < T; j++) {
                if (arr[i] + arr[j] == sum) {
                    cnt++;
                    a++;
                }

            }
        }
        System.out.println(cnt);
    }
}
