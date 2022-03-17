package basic.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제로 (https://www.acmicpc.net/problem/10773)
 */
public class Ex10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        int num, recentNum, ret = 0;
        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(br.readLine());

            if (num == 0) {
                recentNum = (int) stack.pop();
                ret -= recentNum;
                continue;
            }

            stack.push(num);
            ret += num;
        }

        System.out.println(ret);
    }
}
