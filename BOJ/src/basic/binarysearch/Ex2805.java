package basic.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나무 자르기 (https://www.acmicpc.net/problem/2805)
 * : 상근이는 나무 M미터가 필요하다. 한 줄에 N개의 나무가 한 번에 잘리며, H미터 위의 부분이 잘리게 된다.
 *  절단기의 높이 H의 최댓값을 출력한다.
 *
 * 아이디어
 * : 이분탐색. 가장 높은 나무의 높이 / 2를 시작점으로 잘리는 나무의 길이를 구한 뒤 중간값 비교.
 *  작으면 더 낮게 자르고, 중간값이 더 크면 더 높게 자르며 반복 탐색.
 */
public class Ex2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int min = 0, max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        while (min < max) {
            int mid = (max + min) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) {
                    sum += (arr[i] - mid);
                }
            }

            if (sum >= M) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        System.out.println(min - 1);
    }
}
