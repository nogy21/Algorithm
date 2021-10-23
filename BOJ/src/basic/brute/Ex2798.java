package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] list = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        int res = blackjack(N, M, list);
        System.out.println(res);
        br.close();
    }

    private static int blackjack(int n, int m, int[] list) throws IOException {
        int max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int tmp = list[i] + list[j] + list[k];
                    if (tmp == m) {
                        return tmp;
                    }
                    if (max < tmp && tmp <= m)
                        max = tmp;
                }
            }
        }
        return max;
    }
}
