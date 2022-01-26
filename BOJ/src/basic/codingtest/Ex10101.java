package basic.codingtest;

import java.util.Scanner;

/**
 * 삼각형 외우기
 * -----------
 * 삼각형의 세 각을 입력받은 다음,
 * 세 각의 크기가 모두 60이면, Equilateral
 * 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 * 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 * 세 각의 합이 180이 아닌 경우에는 Error
 * 를 출력하는 프로그램을 작성하시오.
 * -----------
 * 예제 입력
 * -----------
 * 60
 * 70
 * 50
 * -----------
 * 예제 출력
 * -----------
 * Scalene
 * -----------
 */
public class Ex10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String triangleShape = decideTriangleShape(a, b, c);
        System.out.println(triangleShape);
    }

    private static String decideTriangleShape(int a, int b, int c) {
        if (a + b + c != 180)
            return "Error";
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
