package basic.string;

import java.util.Scanner;

public class String6_ex2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// �׽�Ʈ ���̽� ����
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();// �ݺ� Ƚ��
			String str = sc.next();// �׽�Ʈ ���̽�
			for (int j = 0; j < str.length(); j++) {// ���ڿ� ���̸�ŭ �ݺ�
				for (int k = 0; k < r; k++) {// index j�� �ش��ϴ� ���ڸ� �Է��� �ݺ� Ƚ����ŭ ���
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
