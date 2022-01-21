package greedy;

import java.util.Scanner;

public class ex2 {

/**
 * 1이 될 때까지
 *  어떤 수 N이 1이 될 때까지 N에서 1을 빼거나 N을 K로 나누는 두 과정 중 하나를 반복적으로 선택하여 수행한다.
 *  첫째 줄에 N(1 <= N <= 100,000)과 K(2 <= K <= 100,000)가 공백을 기준으로 하여 각각 자연수로 주어진다.
 *  첫째 줄에 N이 1이 될 때까지 1버 혹은 2번의 과정을 수행해야 하는 횟수의 최솟값을 출력하라.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;

        // 내가 작성한 코드(입력값에 유효하지만 속도가 느림. 더 큰 수가 입력될 경우 시간 초과 가능)
        /*
        while (n > 1) {
            if (n % k == 0) {
                n = n / k;
            } else {
                n -= 1;
            }
            result ++;
        }
         */

        /**
         * 답안 예시
         *  시간복잡도가 logN
         */

        while(true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n / k) * k;
            result += (n - target);
            // N이 K보다 작을 때 탈출
            n = target;
            if (n < k) break;
            // K로 나누기
            result++;
            n /= k;
        }

        result += (n - 1);

        System.out.println(result);

    }

}