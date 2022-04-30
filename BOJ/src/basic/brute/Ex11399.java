package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * ATM (https://www.acmicpc.net/problem/11399)
 * : 사람은 1번부터 N번까지 번호가 매겨져 있으며, 사람들이 줄을 서는 순서에 따라서, 돈을 인출하는데 필요한 시간의 합이 달라지게 된다.
 *  예를 들어, 총 5명 P1=3, P2=1, P3=4, P4=3, P5=2 인 경우, [1, 2, 3, 4, 5] 순서로 줄을 선다면, 3+4+8+11+13 = 39분이 걸린다.
 *  줄을 [2, 5, 1, 4, 3] 순서로 줄을 서면 1+2+3+3+4 = 13분이 걸리게 된다.
 *
 * 아이디어
 * : 정렬 후 누적합
 */
public class Ex11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        int[] prefixSum = new int[N];
        int answer = prefixSum[0] = arr.get(0);
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr.get(i);
            answer += prefixSum[i];
        }

        System.out.println(answer);
    }
}
