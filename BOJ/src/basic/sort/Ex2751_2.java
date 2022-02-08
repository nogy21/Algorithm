package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 수 정렬하기 2(https://www.acmicpc.net/problem/2751)
 */
public class Ex2751_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int i;
        for (i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int number : list) {
            sb.append(number).append("\n");
        }

        System.out.print(sb);
    }
}
