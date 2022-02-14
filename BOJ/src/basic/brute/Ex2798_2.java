package basic.brute;

import java.io.*;
import java.util.*;

/**
 * 블랙잭(https://www.acmicpc.net/problem/2798)
 */
public class Ex2798_2 {
    static int n, m, result;
    static int[] cardList;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        cardList = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cardList[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0, 0);
        System.out.println(result);
    }

    private static void dfs(int depth, int beginWith, int sum) {
        if (sum > m) return;
        if (depth == 3) {
            result = Math.max(sum, result);
            return;
        }
        for (int i = beginWith; i < n; i++) {
            dfs(depth + 1, i + 1, sum + cardList[i]);
        }
    }
}
