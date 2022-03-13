package basic.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 음계 (https://www.acmicpc.net/problem/2920)
 */
public class Ex2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 1; i < 8; i++) {
            if (arr[i] > arr[i - 1]) {
                result++;
            } else {
                result--;
            }
        }

        switch (result) {
            case 7 :
                System.out.println("ascending");
                break;
            case -7 :
                System.out.println("descending");
                break;
            default:
                System.out.println("mixed");
        }
    }
}
