package basic.greedy;

import java.util.Scanner;

/**
 * 동전 0 (https://www.acmicpc.net/problem/11047)
 * : 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 *   동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 *  
 * 아이디어
 * : K원을 큰 단위부터 나눠지는지 판단 -> 나눠지는 경우 그만큼 카운트 증가 후 남은 값을 다음 단위로 넘어가며 반복
 *
 */
public class Ex11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 조건 입력
        int N = sc.nextInt();
        int K = sc.nextInt();
        int coins[] = new int[N];
        // 동전 종류 입력
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int answer = 0;
        // 동전 단위별로 확인
        for (int i = N - 1; i >= 0; i--) {
            if (K / coins[i] == 0) {
                continue;
            }

            answer += K / coins[i];
            K = K % coins[i];

            if (K == 0) {
                break;
            }
        }
        System.out.println(answer);
    }
}
