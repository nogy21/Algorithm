package basic.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 카드2 (https://www.acmicpc.net/problem/2164)
 *
 * 아이디어
 * : 제일 위 - 1, 아래 - N. 카드 한 장 남을 때까지 아래 행동 반복
 * 맨 위 버림 -> 새로운 맨 위 카드 제일 아래로
 *
 * 시간복잡도
 * : N <= 500,000
 * 한 장씩 버리므로, O(N + N)
 */
public class Ex2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        for (int i = 1; i < N; i++) {
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.peek());
    }
}
