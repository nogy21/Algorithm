package basic.greedy;

import java.util.Scanner;

/**
 * 잃어버린 괄호 (https://www.acmicpc.net/problem/1541)
 * : 세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
 * 그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
 * 입력
 * : 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다.
 * 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다.
 * 수는 0으로 시작할 수 있다. 입력으로 주어지는 식의 길이는 50보다 작거나 같다.
 *
 * 아이디어
 * : '-'가 등장한 시점부터 다음 '-'가 등장할 때 까지 모두 더한다. 뺄셈을 기준으로 분리
 * 뺄셈을 제외한 값들은 분리된 값들끼리 더한 뒤 뺄셈 진행. (첫 번째 값은 양수로 시작함)
 */
public class Ex1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] splitWithMinus = sc.nextLine().split("-");
        /*for (String val : splitWithMinus) {
            System.out.println(val);
        }*/
        int result = 0;
        for (String number : splitWithMinus[0].split("\\+")) {
            result += Integer.parseInt(number);
        }
        for (int i = 1; i < splitWithMinus.length; i++) {
            // 메타문자로 들어가는 특수문자는 이스케이프 처리
            String[] numbers = splitWithMinus[i].split("\\+");
            for (String number : numbers) {
                result -= Integer.parseInt(number);
            }
        }
        System.out.println(result);
    }
}
