/*
�Էµ� �� ���� a, b �� ū ���� ����ϴ� ���α׷��� �ۼ��غ���.
��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.
 */
import java.util.Scanner;
public class Ex1063 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a > b ? a : b);
		scan.close();
	}
}