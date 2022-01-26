package basic.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 소음
 * -----------
 * 얼마전에 초등학교 선생님으로 취직한 상근이는 이 문제를 수학 문제로 해결한다. 학생들을 진정시키기 위해 칠판에 수학 문제를 써주고, 아이들에게 조용히 이 문제를 풀게 한다. 학생들이 문제를 금방 풀고 다시 떠드는 것을 방지하기 위해서, 숫자를 매우 크게 한다.
 * 아직 초등학교이기 때문에, 학생들은 덧셈과 곱셈만 배웠다. 또, 아직 10의 제곱꼴을 제외한 다른 수는 학교에서 배우지 않았기 때문에, 선생님이 써주는 수는 모두 10의 제곱 형태이다.
 * 쉬는 시간까지 문제를 푸는 것을 막기 위해서, 선생님이 써주는 숫자는 최대 100자리이다.
 * 칠판에 쓰여 있는 문제가 주어졌을 때, 결과를 구하는 프로그램을 작성하시오.
 * -----------
 * 입력
 * -----------
 * 첫째 줄에 양의 정수 A가 주어진다.
 * 둘째 줄에 연산자 + 또는 *가 주어진다.
 * 셋째 줄에 양의 정수 B가 주어진다.
 * A와 B는 모두 10의 제곱 형태이고, 길이는 최대 100자리이다.
 * -----------
 * 출력
 * -----------
 * 첫째 줄에 결과를 출력한다. 결과는 A+B 또는 A*B이며, 입력에서 주어지는 연산자에 의해 결정된다.
 * -----------
 * 예제 입력
 * -----------
 * 1000
 * *
 * 100
 * -----------
 * 예제 출력
 * -----------
 * 100000
 * -----------
 */
public class Ex2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strA = br.readLine();
        char operator = (char) br.read();
        br.readLine();
        String strB = br.readLine();
        br.close();

        BigInteger a = new BigInteger(strA);
        BigInteger b = new BigInteger(strB);

        BigInteger result = null;

        if (operator == '*') {
            result = a.multiply(b);
        } else {
            result = a.add(b);
        }
        System.out.println(result);
    }
}
