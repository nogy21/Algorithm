/*
	���� 2��(a, b)�� �Է¹޾� ��, ��, ��, ��, ������, ���� ���� �ڵ����� ����غ���.
	�� 0 <= a, b <= 2147483647, b�� 0�� �ƴϴ�.	
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