package basic.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2447_2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                prtStar(i, j, n);
            }
            System.out.println();
        }
    }

    private static void prtStar(int i, int j, int n) {
        if ((i / n) % 3 == 1 && (j / n) % 3 == 1) {
            System.out.print(" ");
        } else {
            if (n / 3 == 0)
                System.out.print("*");
            else
                prtStar(i, j, n / 3);
        }
    }
}
