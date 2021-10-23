package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = divSum(br.readLine());
        System.out.println(res);
    }

    private static int divSum(String n) throws IOException {
        int min = 0;
        int m = Integer.parseInt(n);
        for (int i = m - (n.length() * 9); i < m; i++) {
            min = i;
            int tmp = i;
            while (tmp != 0) {
                min += tmp % 10;
                tmp /= 10;
            }
            if (m == min) {
                min = i;
                break;
            } else {
                min = 0;
            }
        }
        return min;
    }
}
