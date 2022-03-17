package basic.stack;

import java.io.*;
import java.util.*;

/**
 * 균형 잡힌 세계 (https://www.acmicpc.net/problem/4949)
 */
public class Ex4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while (true) {
            str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            sb.append(solve(str)).append("\n");
        }

        System.out.println(sb);
    }

    private static String solve(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return "no";
                }
                char tmp = stack.peek();
                if (tmp == '(' && c == ')' || tmp == '[' && c == ']') {
                    stack.pop();
                } else {
                    return "no";
                }
            }
        }

        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }

    }
}
