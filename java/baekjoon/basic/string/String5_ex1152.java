package basic.string;

import java.util.Scanner;

public class String5_ex1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");// �� �ڷ� ������ ���� �� �ִ�.
		int result = arr.length;// ������� �⺻������ �迭�� ���̸� ����
		for(int i=0; i<arr.length; i++) {// �Է¹��� ���� �� ��, �ڿ� ������ ���� ��� Ȯ��
			if(arr[i].equals(""))// ������ ��� ��������� -1
				result -= 1;
		}
		System.out.println(result);
		sc.close();
	}
}
