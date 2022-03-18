package basic.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 수열 (https://www.acmicpc.net/problem/1874)
 * 스택 클래스 활용
 */
public class Ex1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int pushNum = 1, idx = 1;

        while(n -- > 0) {
            int val = Integer.parseInt(br.readLine());

            if (val >= pushNum) {
                while (val >= pushNum) {
                    stack.push(pushNum++);
                    sb.append("+").append("\n");
                }
            } else if (val != stack.peek()) {
                System.out.println("NO");
                System.exit(0);
            }

            idx--;
            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}
