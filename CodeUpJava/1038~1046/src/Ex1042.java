/*
	���� 2��(a, b) �� �Է¹޾� a�� b�� ���� ���� ����غ���.
	��, -2147483648 <= a <= b <= +2147483647, b�� 0�� �ƴϴ�.
 */
import java.util.Scanner;
public class Ex1042 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a/b);
	}
}