package basic.array;

import java.util.Scanner;
/*
 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
 * 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶�� 
 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�,
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 */
public class ArrayEx03 {
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
