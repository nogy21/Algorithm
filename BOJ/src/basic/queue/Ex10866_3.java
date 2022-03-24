package basic.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/**
 * 덱 (https://www.acmicpc.net/problem/10866)
 * Deque - int[] 사용
 */
public class Ex10866_3 {
    static int front = 10000;
    static int back = 10000;
    static int size = 0;
    static int[] deque = new int[20001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    static void push_front(int val) {
        // 원소를 먼저 넣은 뒤 front 감소
        deque[front] = val;
        front--;
        size++;
    }

    static void push_back(int val) {
        back++;
        size++;
        deque[back] = val;
    }

    static int pop_front() {
        if (size == 0) {
            return -1;
        }

        int ret = deque[front + 1];
        front++;
        size--;
        return ret;
    }

    static int pop_back() {
        if (size == 0) {
            return -1;
        }

        int ret = deque[back];
        back--;
        size--;
        return ret;
    }

    static int size() {
        return size;
    }

    static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    static int front() {
        if (size == 0) {
            return -1;
        }
        return deque[front + 1];
    }

    static int back() {
        if (size == 0) {
            return -1;
        }
        return deque[back];
    }
}
