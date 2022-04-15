package main.lv3.네트워크;
/**
 * 고득점 Kit DFS/BFS
 * - 네트워크 (https://programmers.co.kr/learn/courses/30/lessons/43162)
 * - 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers 가 매개변수, 네트워크의 개수를 return
 *
 * 아이디어
 * : 반복문을 통해 i를 증가시키며 i와 연결된 네트워크 탐색
 * - i == j는 제외
 * - i와 연결된 모든 네트워크는 하나로 카운트하며, 방문처리
 */
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
