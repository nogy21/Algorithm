/*
16����(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)�� ���
����(01)�̴� 16�������� ���ϴ� 16���� ������?�� ���ؼ� �ñ�������.

A, B, C, D, E, F �� �ϳ��� �Էµ� ��,
1���� F���� ���� 16���� �������� ������ ����غ���.
(��, A ~ F ������ �Էµȴ�.)
*/
import java.util.Scanner;
public class Ex1082 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(16);
		for (int i = 1; i < 16; i++) {
			System.out.printf("%X*%X=%X\n", n, i, n*i);
		}
		scan.close();
	}

}
