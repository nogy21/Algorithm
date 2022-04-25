package main.lv3.단어변환;

/**
 * 고득점 Kit 정렬
 *  - 단어변환 (https://programmers.co.kr/learn/courses/30/lessons/43163)
 *  : 두 개의 단어 begin, target 과 단어의 집합 words 가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin 을 target 으로 변환할 수 있는지 return
 *
 * 제한사항
 *  각 단어는 알파벳 소문자로만 이루어져 있습니다.
 *  각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
 *  words 에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
 *  begin 과 target 은 같지 않습니다.
 *  변환할 수 없는 경우에는 0를 return 합니다.
 *
 * 아이디어
 * : 백트래킹, 한 글자만 다른 값 확인 후 dfs 탐색으로 target 과 동일한 최소값 반환
 */
public class Solution {
    static int answer;
    static boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        answer = Integer.MAX_VALUE;
        visited = new boolean[words.length];

        if (checkContains(target, words)) {
            dfs(begin, target, words, 0);
        } else {
            return 0;
        }

        return answer;
    }

    private boolean checkContains(String target, String[] words) {
        boolean ret = false;
        for (String word : words) {
            if (word.equals(target)) {
                ret = true;
                break;
            }
        }
        return ret;
    }

    private void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isChangeable(begin, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }

    private boolean isChangeable(String begin, String word) {
        int cnt = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) == word.charAt(i)) {
                cnt++;
            }
        }

        if (cnt == begin.length() - 1) {
            return true;
        }
        return false;
    }
}
