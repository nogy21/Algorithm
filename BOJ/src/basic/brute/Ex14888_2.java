package basic.brute;

import java.io.*;
import java.util.*;

/**
 * 연산자 끼워넣기
 * 연산자 우선 순위를 무시하며 N개의 수와 N-1개의 연산자를 통해 만들 수 있는 최대값과 최소값 구하기
 * 
 * 첫 번째 값을 매개변수로 넣은 뒤, dfs를 호출할 때마다 바로 연산 결과를 전달
 * 연산을 모두 수행(depth == n)했다면 최대값과 최소값을 각각 비교하며 저장
 */
public class Ex14888_2 {
    private static int n;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static int[] arr;
    private static int[] operators = new int[4];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int val, int depth) {
        if (depth == n) {
            min = Math.min(min, val);
            max = Math.max(max, val);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0: dfs(val + arr[depth], depth + 1);
                        break;
                    case 1: dfs(val - arr[depth], depth + 1);
                        break;
                    case 2: dfs(val * arr[depth], depth + 1);
                        break;
                    case 3: dfs(val / arr[depth], depth + 1);
                        break;
                }
                operators[i]++;
            }
        }
    }
}
