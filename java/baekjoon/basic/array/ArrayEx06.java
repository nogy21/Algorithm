package basic.array;

import java.util.Scanner;
/* "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
 * 
 */
public class ArrayEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  // ���� ��
		
		for(int i=0; i<t; i++) {  // ���� ����ŭ �ݺ�
			String answers = sc.next();  // ���ο� ����� ���� �Է¹���
			int cnt = 0;  // ���� Ƚ���� ����
			int sum = 0;  // ������ ����
			for(int j=0; j<answers.length();j++) {  // ���� ���信 ���� ����
				if(answers.charAt(j) == 'O') {  // ������ ���
					cnt++;  // ���� ���� ����
					sum += cnt;  // ���� ��� ���ӵ� ����ŭ ������ �ö󰡱⿡ ������ ����ؼ� cnt�� ����
				}
				else {
					cnt = 0;  // Ʋ�� ��� ������ cnt�� �ʱ�ȭ
				}
			}
			System.out.println(sum);
		}		
		sc.close();
	}
}
