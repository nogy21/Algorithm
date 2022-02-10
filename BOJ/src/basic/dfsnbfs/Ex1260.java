package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * DFS와 BFS(https://www.acmicpc.net/problem/1260)
 */
public class Ex1260 {

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int n, m, start;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점 개수
        m = Integer.parseInt(st.nextToken()); // 간선 개수
        start = Integer.parseInt(st.nextToken()); // 정점 번호
        visited = new boolean[n + 1];

        int i;
        for (i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 정점
            int y = Integer.parseInt(st.nextToken()); // 연결된 간선
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for (i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(start);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(start);
    }

    static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
}
