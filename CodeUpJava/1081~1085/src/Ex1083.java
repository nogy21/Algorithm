/*
3 6 9 ������ �ϴ� �����̴� 3 6 9 ���ӿ��� ���� �Ǽ��� ����ؼ� ��Ģ�� �ް� �Ǿ���.
3 6 9 ������ ���� �Ǳ� ���� ������ ���α׷��� �ۼ��� ����.
*/
import java.util.Scanner;
public class Ex1083 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0)
				System.out.printf("X ");
			else
				System.out.printf(i +" ");
		}
		scan.close();
	}

}
