package basic.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10872 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(FibonacciSeq(N));
    }

    private static int FibonacciSeq(int n) {
        if (n <= 1) {
            return n;
        } else
            return FibonacciSeq(n - 1) + FibonacciSeq(n - 2);
    }
}
