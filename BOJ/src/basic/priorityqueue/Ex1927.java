package basic.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 최소 힙 (https://www.acmicpc.net/problem/1927)
 * : 널리 잘 알려진 자료구조 중 최소 힙이 있다. 최소 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.
 * 배열에 자연수 x를 넣는다.
 * 배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
 * 프로그램은 처음에 비어있는 배열에서 시작하게 된다.
 */
public class Ex1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(N-- > 0) {
            int val = Integer.parseInt(br.readLine());
            if (val == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                    continue;
                }
                sb.append(pq.poll()).append("\n");
            } else {
                pq.add(val);
            }
        }

        System.out.println(sb.toString());
    }
}
