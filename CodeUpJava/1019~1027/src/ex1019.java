/*
������ �Է¹޾� �״�� ����ϱ�
��, ��, ���� ".(��)"���� ���еǾ� �Էµȴ�.
�Է¹��� ��, ��, ���� yyyy.mm.dd �������� ����Ѵ�.
(%02d�� ����ϸ� 2ĭ�� ����� ����ϴµ�, �� �ڸ� ���� ��� �տ� 0�� �ٿ� ����Ѵ�.)
*/
import java.util.Scanner;
public class ex1019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("\\.");
		int Year = Integer.valueOf(arr[0]);
		int Month = Integer.valueOf(arr[1]);
		int Day = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", Year, Month, Day);
	}
}