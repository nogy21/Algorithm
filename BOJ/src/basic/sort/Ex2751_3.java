package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 2(https://www.acmicpc.net/problem/2751)
 */
public class Ex2751_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // -1000000 ~ 1000000, 기준점 0: index 1000000
        boolean[] numbers = new boolean[2000001];

        int n = Integer.parseInt(br.readLine());

        int i;
        for (i = 0; i < n; i++) {
            numbers[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i]) {
                sb.append((i - 1000000) + "\n");
            }
        }

        System.out.print(sb);
    }
}
