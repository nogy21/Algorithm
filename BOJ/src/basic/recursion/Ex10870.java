package basic.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10870 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }

    private static int factorial(int n) {
        if (n <= 1)
            return n;
        else
            return factorial(n - 1) + factorial(n - 2);
    }
}
