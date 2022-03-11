package basic.binarysearch;

import java.io.*;
import java.util.*;

/**
 * 수 찾기 (https://www.acmicpc.net/problem/1920)
 */
public class Ex1920 {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int res = binarySearch(Integer.parseInt(st.nextToken()), 0, n-1);
            System.out.println(res);
        }
    }

    private static int binarySearch(int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return 1;
        } else if (arr[mid] > target) {
            return binarySearch(target, start, mid - 1);
        } else {
            return binarySearch(target, mid + 1, end);
        }
    }
}
