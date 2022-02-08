package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나이순 정렬(https://www.acmicpc.net/problem/10814)
 */
public class Ex10814_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder[] ageSb = new StringBuilder[201];
        StringTokenizer st;

        for (int i = 0; i < 201; i++) {
            ageSb[i] = new StringBuilder("");
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            ageSb[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }

        for (StringBuilder sb : ageSb) {
            System.out.print(sb);
        }
    }

}
