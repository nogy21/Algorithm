package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연산자 끼워넣기(https://www.acmicpc.net/problem/14888)
 */
public class Ex14888 {

    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] numbers;
    static int[] operators = new int[4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }
        dfs(numbers[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int num, int idx) {
        // 모두 수행한 후 최대값과 최소값 출력
        if (idx == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0: dfs(num + numbers[idx], idx + 1);
                        break;
                    case 1: dfs(num - numbers[idx], idx + 1);
                        break;
                    case 2: dfs(num * numbers[idx], idx + 1);
                        break;
                    case 3: dfs(num / numbers[idx], idx + 1);
                        break;
                }
                operators[i]++;
            }
        }
    }
}
