package basic.array;

import java.util.Scanner;
/* �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. 
 * ��° �ٿ� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
 * ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ù��° �Է°��� ���̷� �ϴ� �迭 ����.
		int[] arr = new int[sc.nextInt()];
		int max = 0;
		double sum = 0;
		// �迭�� ���� �Է�
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			// �ִ밪 ��
			if(max < arr[i]) {
				max = arr[i];
			}
			// ����
			sum += arr[i];
		}
		
		// �հ� / �ְ���*100 / ���� ��
		System.out.println((sum/max)*100/arr.length);
		sc.close();
	}
}
