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
 * : 인덱스별 누적합 구한 뒤 구간별 최대값 비교
 */
public class Ex2559_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] prefixSum = new int[N];

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int sum = 0, answer = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            prefixSum[i] = sum;
            if (i == K - 1) {
                answer = sum;
            }
        }

        for (int i = 0; i < N - K; i++) {
            answer = Math.max(answer, prefixSum[i + K] - prefixSum[i]);
        }

        System.out.println(answer);
    }
}
