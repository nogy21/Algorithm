/*
	���� 3���� �Է¹޾� �հ� ����� ����غ���.
	��, -2147483648 ~ +2147483647
	�հ� ����� ���� �ٲ� ����Ѵ�.
	����� �Ҽ��� ���� ��° �ڸ����� �ݿø��ؼ� �Ҽ��� ���� ù° �ڸ����� ����Ѵ�.
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