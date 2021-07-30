/*
	정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
	단 0 <= a, b <= 2147483647, b는 0이 아니다.	
 */
import java.util.Scanner;
public class Ex1045 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println((int)(a+b));
		System.out.println((int)(a-b));
		System.out.println((int)(a*b));
		System.out.println((int)(a/b));
		System.out.println((int)(a%b));
		System.out.println(String.format("%.2f", (a/b)));
	}
}