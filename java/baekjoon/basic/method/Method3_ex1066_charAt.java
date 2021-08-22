package basic.method;

import java.util.Scanner;

/*
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�) ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
���) ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
 */

public class Method3_ex1066_charAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), cnt = 0;
        sc.close();
		if (N <= 99) 
			cnt += N; // 100 �̸��� �ڿ��� �״�� ��ȯ
		else 
			cnt += 99;
		for (int i = 100; i <= N; i++) {
			String str = Integer.toString(i);  // ���ڿ� ��ġ�� Ȯ���ϱ� ���� String Ÿ�� ���� ����
			int diff = str.charAt(1) - str.charAt(0);  // ���� �ڸ�, ���� �ڸ����� ��
			boolean flag = true;
			for(int j = 1; j < str.length()-1; j++) {  // diff ���� �̹� �������Ƿ� 1���� ���� -1��ŭ �ݺ�
				if(str.charAt(j+1) - str.charAt(j) != diff) {  // ���� �ڸ��� ���� �ڸ� ���� ��; �Ѽ��� �ƴ� ��� false
					flag = false;
					break;
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
	}
}