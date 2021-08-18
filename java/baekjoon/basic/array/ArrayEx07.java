package basic.array;

import java.util.Scanner;
/* ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����,
�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */
public class ArrayEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  // �׽�Ʈ���̽� ��
		int[] arr;  // ���� ������ �迭 ����
		for(int i=0; i<t; i++) {  // �׽�Ʈ���̽� ����ŭ �ݺ�
			int n = sc.nextInt();  // �л� ��
			arr = new int[n];  // �л� ����ŭ�� ũ�⸦ ������ �迭�� �ʱ�ȭ
			
			double sum = 0;  // ���� �հ� ����
			for(int j=0; j<n; j++) {  // ���� �Է� ���� �л� ����ŭ �ݺ�
				arr[j] = sc.nextInt();  // �л� ����
				sum += arr[j];  // ���� ����
			}
			double cnt = 0;  // ����� �ѱ�� �л� �� ����. �л� ������ ���ؾ� �ϱ⿡ double������ ����
			for(int j=0; j<n; j++) {
				if(arr[j] > (sum/n))
					cnt++;
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}		
		sc.close();
	}
}
