package basic.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제 0 (https://www.acmicpc.net/problem/11866)
 * 아이디어
 * : 1~N까지 원, 순서대로 K번째 사람 제거 ex) 1 2 3 4 5 6 7
 * 3 -> 45 6 712
 * 6 -> 71 2 45
 * 2 -> 45 7 1
 * 7 -> 145
 * 5 -> 14
 * 1, 4
 * 
 * K 전까지 꺼내고 -> 다시 추가,
 * K번째 숫자 꺼내고 -> 저장
 * size 가 1일 때까지 반복
 * 
 * 시간복잡도
 * : 1 <= K <= N <= 1,000
 * O(KN) = 1,000,000
 */
public class Ex11866 {
    static int N, K;
    static LinkedList<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        // queue 에 1~N 까지 입력
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        sb.append("<");
        while (q.size() > 1) {
            for (int i = 1; i < K; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.pop()).append(">");

        System.out.println(sb);
    }
}