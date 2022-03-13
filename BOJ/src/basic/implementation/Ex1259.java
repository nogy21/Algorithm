package basic.implementation;

import java.io.*;

/**
 * 팰린드롬수 (https://www.acmicpc.net/problem/1259)
 */
public class Ex1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int len = target.length();
        String answer = "";

        while (!target.equals("0")) {
            len = target.length();
            answer = "yes";

            for (int i = 0; i < len / 2; i++) {
                if (target.charAt(i) != target.charAt(len - i - 1)) {
                    answer = "no";
                }
            }

            System.out.println(answer);
            target = br.readLine();
        }

    }
}
