package basic.string;

import java.util.Scanner;

public class String09_ex2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().trim();// ������ Ȱ���ϱ� ���� �̸� ���� ����
		sc.close();
		int count = 0;// �����
		String[] crt = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };//�迭 ����
		for (int i = 0; i < crt.length; i++) {// ũ�ξ�Ƽ�� ���ĺ� ������ŭ �ݺ�
			if (str.contains(crt[i])) {// crt ��Ұ��� ��ġ�ϴ� ���ڿ��� ��� �������� �ٲ�
				str = str.replaceAll(crt[i], " ");
			}
		}
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)==' ')//crt�� �������� ġȯ�����Ƿ� �׸�ŭ count ����
				count++;
		}
		str = str.replaceAll(" ", "");// ���� ����
		count += str.length();// ���� ���ĺ��� ����
		
		System.out.println(count);
	}
}