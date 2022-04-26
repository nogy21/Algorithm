package basic.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 인간-컴퓨터 상호작용 (https://www.acmicpc.net/problem/16139)
 * : 문자열 S, 특정 알파벳 a와 문자열의 구간 [l,r]이 주어지면 S의 l번째 문자부터 r번째 문자 사이에 a가 몇 번 나타나는지 구하라
 *
 * 입력
 * : 문자열의 길이는 200,000자 이하이며 알파벳 소문자로만 구성
 *  두 번째 줄에는 질문의 수 q가 주어지며, 문제의 수는 1 <= q <= 200,000을 만족한다.
 *  세 번째 줄부터 (q+2)번째 줄에는 질문이 주어진다.
 *  각 질문은 알파벳 소문자 a와 0 <= l <= r를 만족하는 정수 l, r이 공백으로 구분된다.
 *
 * 아이디어
 * : 알파벳 모두 누적합 구한 뒤 정답 탐색
 */
public class Ex16139 {
    static int[][] prefixSum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        prefixSum = new int[S.length()][26];

        findAllPrefixSum(S);

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char target = st.nextToken().charAt(0);
            int startIdx = Integer.parseInt(st.nextToken());
            int endIdx = Integer.parseInt(st.nextToken());

            int answer = findAnswer(target, startIdx, endIdx);

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }

    private static void findAllPrefixSum(String s) {
        prefixSum[0][s.charAt(0) - 'a']++;

        for (int i = 1; i < s.length(); i++) {
            int target = s.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j];
            }
            prefixSum[i][target]++;
        }
    }

    private static int findAnswer(char target, int startIdx, int endIdx) {
        if (startIdx == 0) {
            return prefixSum[endIdx][target - 'a'];
        }
        return prefixSum[endIdx][target - 'a'] - prefixSum[startIdx - 1][target - 'a'];
    }
}
