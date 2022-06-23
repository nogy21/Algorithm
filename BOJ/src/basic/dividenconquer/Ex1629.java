package basic.dividenconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 곱셈 (https://www.acmicpc.net/problem/1629)
 * : 자연수 A를 B번 곱한 수를 알고 싶다. 단 구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * : 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 모두 2,147,483,647 이하의 자연수이다.
 *
 * 출력
 * : 첫째 줄에 A를 B번 곱한 수를 C로 나눈 나머지를 출력한다.
 *
 * 아이디어
 * : 분할탐색.
 * 1) a^n == a^(n/2) * a^(n/2) == (a^(n/4) * a^(n/4)) * (a^(n/4) * a^(n/4)) == ...
 * 2) (a * b) % c == (a % c * b % c) % c
 */
public class Ex1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());

        System.out.println(mod(A % C, B, C));
    }

    private static long mod(long a, long b, long c) {
        if (b == 1) return a;
        long temp = mod(a, b / 2, c) % c;
        if (b % 2 == 0) return (temp * temp) % c;
        return (((temp * temp) % c) * a) % c;
    }
}
