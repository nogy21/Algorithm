package basic.array;

import java.util.Scanner;

public class ArrayEx02_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// ���� ���ؾ� �ϱ� ������ �켱 int������ �Է�
		int n = sc.nextInt() * sc.nextInt() * sc.nextInt();
		// ���� ���� �ڸ����� ��ġ�ϴ� ���ڸ� Ȯ���ؾ� �ϱ⿡ String���� ��ȯ
		String str = Integer.toString(n);
		
		for(int i=0; i<10; i++) {  // 0~9���� ���� ��ġ�ϴ� ������ ������ ã�ƾ� ��
			int count = 0;  // ���ں� ��ġ�ϴ� Ƚ�� ����. �����ϴ� ���� ���ڸ��� �ʱ�ȭ�ؾ� �ϱ⿡ for������ ����
			
			for(int j=0; j<str.length(); j++) {
                // '1' == 49(�ƽ�Ű�ڵ�, int��) ��, '0'(48)�� �������μ� ���ϴ� �ε����� ������ ���� Ȯ���� �� ����
				if((str.charAt(j)-'0')==i)
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}
