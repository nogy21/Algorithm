package basic.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 오큰수 (https://www.acmicpc.net/problem/17298)
 */
public class Ex17298_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        int[] stack = new int[N];
        int top = -1; // stack 마지막 원소

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            while (top != -1 && seq[stack[top]] < seq[i]) {
                seq[stack[top--]] = seq[i];
            }
            stack[++top] = i;
        }

        for (int i = top; i >= 0; i--) {
            seq[stack[i]] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : seq) {
            sb.append(val).append(" ");
        }

        System.out.println(sb);
    }
}
