package basic.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 괄호 (https://www.acmicpc.net/problem/9012)
 */
public class Ex9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack stack;

        int T = Integer.parseInt(br.readLine());
        String str;
        char PS;

        for (int i = 0; i < T; i++) {
            stack = new Stack();
            str = br.readLine();
            int len = str.length();

            for (int j = 0; j < len; j++) {
                PS = str.charAt(j);

                if (j == len - 1) {
                    if (stack.size() == 1 && PS == ')') {
                        sb.append("YES").append("\n");
                    } else {
                        sb.append("NO").append("\n");
                    }
                    break;
                } else if (PS == ')') {
                    if (stack.isEmpty()) {
                        sb.append("NO").append("\n");
                        break;
                    }
                    stack.pop();
                } else {
                    stack.push(PS);
                }
            }
        }

        System.out.println(sb);
    }
}
