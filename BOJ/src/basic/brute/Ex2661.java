package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 좋은수열(https://www.acmicpc.net/problem/2661)
 */
public class Ex2661 {
    static int n;
    static final int START = 1, END = 3;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        backtracking("");
    }

    private static void backtracking(String seq) {
        if (seq.length() == n) {
            System.out.println(seq);
            System.exit(0);
        }
        for (int i = START; i <= END; i++) {
            if (isGoodSequence(seq + i)) {
                backtracking(seq + i);
            }
        }
    }

    private static boolean isGoodSequence(String seq) {
        int halfLength = seq.length() / 2;
        for (int i = 1; i <= halfLength; i++) {
            String firstHalf = seq.substring(seq.length() - 2 * i, seq.length() - i);
            String lastHalf = seq.substring(seq.length() - i, seq.length());
            if (firstHalf.equals(lastHalf)) {
                return false;
            }
        }
        return true;
    }
}
