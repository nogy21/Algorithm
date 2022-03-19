package basic.stack;

import java.io.*;
import java.util.*;

/**
 * 오큰수 (https://www.acmicpc.net/problem/17298)
 * 배열에 수열 입력
 * 반복: 수열의 첫 번째 요소부터 확인
 *     조건,반복: 이전 값 중 현재 값보다 작은 값 존재
 *         배열(스택에서 꺼낸 인덱스)에 현재 값 저장
 *     스택에 현재 인덱스 저장
 * 남은 값 -1 처리
 */
public class Ex17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(seq[i]).append(" ");
        }

        System.out.println(sb);
    }
}