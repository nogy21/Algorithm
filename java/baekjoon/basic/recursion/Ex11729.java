package basic.recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex11729 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int from = 1, via = 2, to = 3;
        bw.write((int) (Math.pow(2, n) - 1) + "\n");
        hanoi(n, from, via, to);
        br.close();
        bw.flush();
        bw.close();
    }

    private static void hanoi(int n, int from, int via, int to) throws IOException {
        if (n == 0) {
            return;
        } else {
            hanoi(n - 1, from, to, via);
            bw.write(from + " " + to + "\n");
            hanoi(n - 1, via, from, to);
        }
    }
}
