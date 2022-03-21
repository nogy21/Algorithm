package basic.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제 0 (https://www.acmicpc.net/problem/11866)
 * 아이디어
 * : 1~N까지 원, 순서대로 K번째 사람 제거
 * ex) 1 2 3 4 5 6 7
 * 3627514
 * ->  3, 12 4567
 * ->  6, 12 45 7
 * ->  2, 1  45 7
 * ->  7, 1  45
 * ->  5, 1  4
 * ->  1,    4
 * ->  4
 * ==> k번째 누적해서 제거, 누적값 < N 인 경우 -> 누적값 % N
 * remove() 사용, 가져올 index = (index + (K - 1)) % N
 * 
 * 시간복잡도
 * : 1 <= K <= N <= 1,000
 * O(N) = 1,000
 */
public class Ex11866_2 {
    static int N, K;
    static LinkedList<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int idx = 0;

        // queue 에 1~N 까지 입력
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        sb.append("<");
        // 마지막 원소만 남을 때까지 반복
        while (N > 1) {
            idx = (idx + (K - 1)) % N; //꺼내와야할 값의 index를 구한다.
            sb.append(q.remove(idx)).append(", ");
            N--;
        }
        sb.append(q.pop()).append(">");

        System.out.println(sb);
    }
}