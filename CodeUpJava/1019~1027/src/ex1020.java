/*
�ֹι�ȣ�� ������ ���� �����ȴ�.
XXXXXX-XXXXXXX
���� 6�ڸ��� �������(yymmdd)�̰� �� 7�ڸ��� ����, ����, ���������ڵ��̴�.
�ֹι�ȣ�� �Է¹޾� ���¸� �ٲ� ����غ���.
'-'�� ������ �ֹι�ȣ 13�ڸ��� ��� �ٿ� ����Ѵ�.
*/
import java.util.Scanner;
public class ex1020 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("-");
		String yymmdd = arr[0];
		String secured = arr[1];
		System.out.printf("%s%s", yymmdd, secured);
	}
}