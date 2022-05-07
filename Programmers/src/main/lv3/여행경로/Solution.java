package main.lv3.여행경로;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 고득점 Kit 정렬
 *  - 여행경로 (https://programmers.co.kr/learn/courses/30/lessons/43164)
 *  : 주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.
 *   항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때,
 *   방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 모든 공항은 알파벳 대문자 3글자로 이루어집니다.
 * 주어진 공항 수는 3개 이상 10,000개 이하입니다.
 * tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
 * 주어진 항공권은 모두 사용해야 합니다.
 * 만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
 * 모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.
 *
 * 아이디어
 * : 각 행 a, b 모두 오름차순 정렬 후 dfs 탐색
 */
public class Solution {
    static String[] answer;
    static boolean[] visited;
    static String[][] sortedTickets;
    static ArrayList<String> destinationList = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        visited = new boolean[tickets.length];

        // 정렬(출발지와 도착지 모두 오름차순)
        sortedTickets = tickets;
        Arrays.sort(sortedTickets, ((o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return o1[1].compareTo(o2[1]);
            } else {
                return o1[0].compareTo(o2[0]);
            }
        }));

        destinationList.add("ICN");
        dfs("ICN", 0);
        return answer;
    }

    private void dfs(String from, int depth) {
        // 정렬을 미리 했기 때문에 정답 이미 찾은 경우 재탐색 X
        if (answer[answer.length - 1] != null) {
            return;
        }

        int len = visited.length;
        // 정답 찾은 경우
        if (depth == len) {
            for (int i = 0; i <= len; i++) {
                answer[i] = destinationList.get(i);
            }
            return;
        }

        for (int i = 0; i < len; i++) {
            // 사용하지 않은 티켓 중 입력받은 출발지와 동일한 출발지를 갖는 티켓
            if (!visited[i] && sortedTickets[i][0].equals(from)) {
                visited[i] = true;
                destinationList.add(sortedTickets[i][1]);
                // 다음 탐색의 출발지는 현재 추가한 티켓의 목적지
                dfs(sortedTickets[i][1], depth + 1);
                // 복구
                visited[i] = false;
                destinationList.remove(destinationList.size() - 1);
            }
        }
    }
}
