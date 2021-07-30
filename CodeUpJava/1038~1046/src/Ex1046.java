/*
	정수 3개를 입력받아 합과 평균을 출력해보자.
	단, -2147483648 ~ +2147483647
	합과 평균을 줄을 바꿔 출력한다.
	평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
 */
import java.util.Scanner;
public class Ex1046 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		System.out.println((long)(a+b+c));
		System.out.println(String.format("%.1f", ((a+b+c)/3)));
	}
}