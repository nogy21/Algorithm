package basic.binarysearch;

import java.io.*;
import java.util.*;

/**
 * 숫자 카드 (https://www.acmicpc.net/problem/10815)
 */
public class Ex10815 {
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

        int target, flag;
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            target = Integer.parseInt(st.nextToken());
            // 탐색 후 존재하면 1 아니면 0
            flag = isExist(target, 0, arr.length - 1);
            sb.append(flag).append(" ");
        }
        System.out.println(sb);
    }

    private static int isExist(int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return 1;
        } else if (arr[mid] > target) {
            return isExist(target, start, mid - 1);
        } else {
            return isExist(target, mid + 1, end);
        }
    }
}
