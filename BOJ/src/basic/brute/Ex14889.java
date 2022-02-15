package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스타트와 링크(https://www.acmicpc.net/problem/14889)
 */
public class Ex14889 {
    static int n, min = Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combi(0, 0);
        System.out.println(min);
    }

    private static void combi(int idx, int count) {
        if (count == n / 2) {
            getAbilityDiff();
            return;
        }
        for (int i = idx; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            combi(i + 1, count + 1);
            visited[i] = false;
        }
    }

    private static void getAbilityDiff() {
        int teamStart = 0, teamLink = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visited[i] == true && visited[j] == true) {
                    teamStart += arr[i][j];
                    teamStart += arr[j][i];
                } else if (visited[i] == false && visited[j] == false) {
                    teamLink += arr[i][j];
                    teamLink += arr[j][i];
                }
            }
        }
        int val = Math.abs(teamStart - teamLink);
        if (val == 0) {
            System.out.println(0);
            System.exit(0);
        }
        min = Math.min(min, val);
    }
}
