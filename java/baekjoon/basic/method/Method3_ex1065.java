package basic.method;

import java.util.Scanner;

/*
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�) ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
���) ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
 */

public class Method3_ex1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(hansu(sc.nextInt()));
		sc.close();
	}

	private static int hansu(int N) {
		int cnt = 0;
		if (N < 100) {  // 100 �̸��� �ڿ����� �ڸ��� ���� ���� ���� �� ����. �״�� ��ȯ. 
			return N;
		} else {
			cnt = 99;
			for (int i = 100; i <= N; i++) {
				if ((i/10)%10 - (i / 100) == (i % 10) - (i/10)%10) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}