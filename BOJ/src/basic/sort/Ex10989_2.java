package basic.sort;

import java.io.*;
import java.util.Arrays;

/**
 * 수 정렬하기 3(https://www.acmicpc.net/problem/10989)
 */
public class Ex10989_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 1; i <= n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 10000; i++) {
            bw.write(String.valueOf(i + "\n").repeat(arr[i]));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
