package basic.string;

import java.util.Scanner;

public class String10_ex1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = N;
		int ans = tmp;
		for (int i = 0; i <= N; i++) {// �Է¹޴� Ƚ����ŭ �ݺ�
			boolean arr[] = new boolean[26];// ���ĺ�, �Ź� �ʱ�ȭ
			String word = sc.nextLine();// Ÿ�� ���ڿ�
			for (int j = 1; j < word.length(); j++) {// ���ڿ� ���̸�ŭ �ݺ�
				if (word.charAt(j - 1) != word.charAt(j)) {// ���� ���ڿ� ���� ���ڰ� �ٸ��ٸ�
					if (arr[word.charAt(j) - 97] == true) {// �׸��� ���� ���� ���ڶ�� �ƿ�
						ans--;
						break;// �ٽ� Ȯ���� �ʿ� x
					} else
						arr[word.charAt(j - 1) - 97] = true;// ���� ���� true�� �Ҵ�
				}
			}
		}
		sc.close();
		System.out.println(ans);
	}
}