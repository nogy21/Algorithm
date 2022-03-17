package basic.stack;

import java.io.*;
import java.util.*;

/**
 * 스택 (https://www.acmicpc.net/problem/10828)
 */
public class Ex10828_2 {
    static int[] stack;
    static int size = 0, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        String order;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            order = st.nextToken();

            switch (order) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    private static void push(int item) {
        stack[size++] = item;
    }

    private static int pop() {
        if (size == 0) {
            return -1;
        }
        ret = stack[--size];
        stack[size] = 0;
        return ret;
    }

    private static int size() {
        return size;
    }

    private static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    private static int top() {
        if (size == 0) {
            return -1;
        }
        return stack[size - 1];
    }
}
