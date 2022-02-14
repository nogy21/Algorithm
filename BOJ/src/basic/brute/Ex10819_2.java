package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 차이를 최대로(https://www.acmicpc.net/problem/10819)
 */
public class Ex10819_2 {
    public static int n, result;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        perm(0);
        System.out.println(result);

    }

    private static void perm(int depth) {
        if (depth == n) {
            calc(arr);
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(depth, i);
            perm(depth + 1);
            swap(depth, i);
        }
    }

    private static void swap(int depth, int i) {
        int tmp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = tmp;
    }

    public static void calc(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        if (result < sum) {
            result = sum;
        }

    }
}
