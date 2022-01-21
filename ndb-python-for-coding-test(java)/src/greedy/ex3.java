package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {

/**
 * 곱하기 혹은 더하기
 *  각 자리가 숫자(0~9)로만 이루어진 문자열 S가 주어졌을 때 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며
 *  숫자 사이에 'x' 혹은 '+' 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하라.
 *  단, +보다 x를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서부터 순서대로 이루어진다.
 *  또한 만들어질 수 있는 가장 큰 수는 항상 20억 이하의 정수가 되도록 입력이 주어진다.
 */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 첫 번째 문자
        int result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            // 1 또는 0인 경우 덧셈, 나머지는 곱셈
            if (result <= 1 || num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);

    }

}