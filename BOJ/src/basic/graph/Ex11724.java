package basic.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연결 요소의 개수 (https://www.acmicpc.net/problem/11724)
 * : 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * : 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
 *
 * 출력
 * : 첫째 줄에 연결 요소의 개수를 출력한다.
 */
public class Ex11724 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[b][a] = graph[a][b] = true;
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
