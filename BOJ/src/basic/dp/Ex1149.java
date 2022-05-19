package basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * RGB거리 (https://www.acmicpc.net/problem/1149)
 * : RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
 *  집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때,
 *  아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.
 *    1번 집의 색은 2번 집의 색과 같지 않아야 한다.
 *    N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
 *    i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
 *
 * 아이디어
 * : 이차원 배열 사용, 집마다 r, g, b 각각의 비용을 누적. (이전 집의 다른 두 색 중 최소값을 더한다)
 */
public class Ex1149 {
    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cost[i][RED] = Integer.parseInt(st.nextToken());
            cost[i][GREEN] = Integer.parseInt(st.nextToken());
            cost[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            cost[i][RED] += Math.min(cost[i - 1][GREEN], cost[i - 1][BLUE]);
            cost[i][GREEN] += Math.min(cost[i - 1][RED], cost[i - 1][BLUE]);
            cost[i][BLUE] += Math.min(cost[i - 1][GREEN], cost[i - 1][RED]);
        }

        int answer = Math.min(Math.min(cost[N - 1][RED], cost[N - 1][GREEN]), cost[N - 1][BLUE]);
        System.out.println(answer);
    }
}
