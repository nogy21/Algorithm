package basic.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 큐 2 (https://www.acmicpc.net/problem/18258)
 *
 * 아이디어
 * : push, pop, size, empty, front, back 구현
 *
 * 복잡도
 * : 1 <= N <= 2,000,000 & 정수 <= 100,000
 * O(N)
 * 
 * LinkedList 사용, ArrayList 는 시간 초과
 */
public class Ex18258 {
    static LinkedList<Integer> queue = new LinkedList<>();
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp;
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        tmp = -1;
                    } else {
                        tmp = queue.get(0);
                        queue.remove(0);
                    }
                    sb.append(tmp).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    tmp = queue.isEmpty() ? 1 : 0;
                    sb.append(tmp).append("\n");
                    break;
                case "front":
                    tmp = queue.isEmpty() ? -1 : queue.get(0);
                    sb.append(tmp).append("\n");
                    break;
                case "back":
                    tmp = queue.isEmpty() ? -1 : queue.get(queue.size() - 1);
                    sb.append(tmp).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
