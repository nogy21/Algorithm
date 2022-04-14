package main.lv3.네트워크;

public class Solution {

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            dfs(n, computers, visited, i);
            answer++;
        }

        return answer;
    }

    private boolean[] dfs(int n, int[][] computers, boolean[] visited, int i) {
        visited[i] = true;

        for (int j = 0; j < n; j++) {
            if (i == j) {
                continue;
            }
            if (computers[i][j] == 1 && computers[j][i] == 1 && !visited[j]) {
                visited = dfs(n, computers, visited, j);
            }
        }
        return visited;
    }
}
