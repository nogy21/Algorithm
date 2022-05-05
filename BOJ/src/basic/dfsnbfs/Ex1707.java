package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 이분 그래프 (https://www.acmicpc.net/problem/1707)
 * : 그래프의 정점의 집합을 둘로 분할하여, 각 집합에 속한 정점끼리는 서로 인접하지 않도록 분할할 수 있을 때,
 * 그러한 그래프를 특별히 이분 그래프 (Bipartite Graph) 라 부른다. 이분 그래프인지 아닌지 판별하는 프로그램
 *
 * 입력
 * : 첫째 줄에 테스트 케이스의 개수 K.
 * 각 테스트 케이스의 첫째 줄에는 그래프의 정점의 개수 V, 간선의 개수 E가 빈 칸을 사이에 두고 순서대로 주어진다.
 * 각 정점에는 1부터 V까지 차례로 번호가 붙어 있다.
 * 이어서 둘째 줄부터 E개의 줄에 걸쳐 간선에 대한 정보가 주어지는데, 각 줄에 인접한 두 정점의 번호 u, v (u ≠ v)가 빈 칸을 사이에 두고 주어진다.
 */
public class Ex1707 {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (K-- > 0) {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            graph = new ArrayList[V + 1];
            visited = new int[V + 1];

            for (int i = 0; i < V + 1; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                graph[u].add(v);
                graph[v].add(u);
            }

            bfs(V);
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < v + 1; i++) {
            if (visited[i] == 0) {
                q.add(i);
                visited[i] = 1;
            }

            while (!q.isEmpty()) {
                int curr = q.poll();

                for (int node : graph[curr]) {
                    if (visited[node] == visited[curr]) {
                        System.out.println("NO");
                        return;
                    }
                    if (visited[node] == 0) {
                        q.offer(node);
                        if (visited[curr] == 1) {
                            visited[node] = 2;
                        } else {
                            visited[node] = 1;
                        }
                    }
                }
            }
        }

        System.out.println("YES");
    }
}
