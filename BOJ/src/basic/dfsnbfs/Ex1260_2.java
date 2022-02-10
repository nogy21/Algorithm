package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * DFS와 BFS(https://www.acmicpc.net/problem/1260)
 */
public class Ex1260_2 {

    static int[] K;
    static int N, M, V;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer>[] line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // 정점 번호
        visited = new boolean[N + 1];
        line = new ArrayList[N + 1];

        int a, b, i;
        for (i = 0; i <= N; i++) {
            line[i] = new ArrayList<Integer>();
        }

        for (i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken()); // 정점
            b = Integer.parseInt(st.nextToken()); // 연결된 간선
            line[a].add(b);
            line[b].add(a);
        }

        for (i = 0; i <= N; i++) {
            Collections.sort(line[i]);
        }

        dfs(V);
        sb.append("\n");
        Arrays.fill(visited, false);
        bfs(V);
        System.out.println(sb);
    }

    static void dfs(int curr) {
        visited[curr] = true;
        sb.append(curr).append(" ");
        for (int i = 0; i < line[curr].size(); i++) {
            int next = line[curr].get(i);
            if (!visited[next]) dfs(next);
        }
    }

    static void bfs(int start) {
        int curr, next;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            curr = q.poll();
            sb.append(curr).append(" ");
            for (int i = 0; i < line[curr].size(); i++) {
                next = line[curr].get(i);
                if (!visited[next]) {
                    q.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}
