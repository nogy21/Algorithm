package basic.stack;

import java.io.*;

/**
 * 스택 수열 (https://www.acmicpc.net/problem/1874)
 * 같은 정수는 다시 들어올 수 없음
 */
public class Ex1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n + 1];

        int pushNum = 0, idx = 1;

        while(n -- > 0) {
            int val = Integer.parseInt(br.readLine());

            if (val > pushNum) {
                while (val > pushNum) {
                    stack[idx++] = ++pushNum;
                    sb.append("+").append("\n");
                }
            } else if (val != stack[idx - 1]) {
                System.out.println("NO");
                System.exit(0);
            }

            idx--;
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}
