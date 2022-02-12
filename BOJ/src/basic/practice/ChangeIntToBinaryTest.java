package basic.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 양의 정수를 2진수로 변환하여 출력하는 테스트
 */
public class ChangeIntToBinaryTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printInBinary(n);
    }

    private static void printInBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}
