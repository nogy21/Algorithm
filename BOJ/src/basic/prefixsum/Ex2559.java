package basic.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수열 (https://www.acmicpc.net/problem/2559)
 * : 첫째 줄에는 입력되는 온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값을 출력한다.
 *
 * 아이디어
 * : K 까지 누적합 구한 뒤 K부터 N까지 반복하며 최대값 비교
 */
public class Ex2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int answer = sum;
        for (int i = K; i < N; i++) {
            sum = sum - arr[i - K] + arr[i];
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}
