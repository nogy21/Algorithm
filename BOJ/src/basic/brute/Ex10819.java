package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 차이를 최대로(https://www.acmicpc.net/problem/10819)
 */
public class Ex10819 {
    static int n, result;
    static int[] arr, tmpArr;
    static boolean[] checkList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        checkList = new boolean[n + 1];
        tmpArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        perm(0);
        System.out.println(result);
    }

    private static void perm(int depth) {
        if (depth == n) {
            result = Math.max(calc(), result);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (checkList[i]) {
                continue;
            }
            checkList[i] = true;
            tmpArr[depth] = arr[i];
            perm(depth + 1);
            checkList[i] = false;
        }
    }

    private static int calc() {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(tmpArr[i] - tmpArr[i + 1]);
        }
        return sum;
    }

}
