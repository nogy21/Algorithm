package basic.string;

import java.util.Scanner;

public class String08_ex1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];// ���ĺ� ����
		String str = sc.next().toUpperCase();// ��ҹ��� ���� ���� �Է¹����� ����� �빮���̹Ƿ� �̸� ��ȯ
		int max = -1;
		char ans = '?';
		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i) - 65;
			arr[tmp]++;// �Է¹��� ���ڿ��� i��° ���ĺ��� +1
			if (max < arr[tmp]) {// �ִ밪 ����
				max = arr[tmp];
				ans= str.charAt(i);// ����� �����ϴ� ������ �ִ밪�� �ش��ϴ� ���� ��ȯ
			}else if(max == arr[tmp])
				ans = '?';// �ִ밪�� �ٸ� ������ ���� ������ ��� ? ��ȯ
		}
		sc.close();
		System.out.println(ans);
	}

}
