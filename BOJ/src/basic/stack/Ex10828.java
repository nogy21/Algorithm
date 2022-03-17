package basic.stack;

import java.io.*;
import java.util.*;

/**
 * 스택 (https://www.acmicpc.net/problem/10828)
 */
public class Ex10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();
        String order = "";
        int cnt, empty;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            order = st.nextToken();

            if (order.equals("push")) {
                cnt = Integer.parseInt(st.nextToken());
                stack.push(cnt);
            }

            if (order.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }

            if (order.equals("size")) {
                sb.append(stack.size()).append("\n");
            }

            if (order.equals("empty")) {
                if (stack.empty()) {
                    empty = 1;
                } else {
                    empty = 0;
                }
                sb.append(empty).append("\n");
            }

            if (order.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
