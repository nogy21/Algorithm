package basic.array;

import java.util.ArrayList;
import java.util.Scanner;

/* ������ �л��鿡�� �뷡�� ����ġ�� �ִ�. �� N���� �Ǻ��� �ְ� i��° �Ǻ��� Bi�ʷ� �̷���� �ִ�. 
 * �л����� 0�ʺ��� 1�� �Ǻ��� ���� �뷡�ϱ� �����ߴ�. 
 * �� B1-1�ʿ� 1�� �Ǻ��� ����ġ�� �ǰ� B1�ʺ��� B1+B2-1�ʱ��� 2�� �Ǻ��� ���� �θ��� �ȴ�.
 * ������ T1���� TQ���� Q���� �ð��� ���� ����� �ϴ� ���ε�, Ti�� �� �뷡�ϴ� �Ǻ��� i��°�� ����ϴ� ���̴�.
 * �Է�
    ù �ٿ��� �Ǻ� �� N(1 �� N �� 100)�� ������ ���� Q(1 �� Q �� 1,000)�� �־�����. 
	���� N���� �ٿ��� 1�� �Ǻ����� N�� �Ǻ����� �� �Ǻ��� �����ϴ� �ð�(��)�� �� �ٿ� �ϳ��� �־�����. 
	�� �Ǻ��� �����ϴ� �ð��� 100 ������ �����̴�. 
	���� Q���� �ٿ��� �˰��� �ϴ� Q���� �ð�(��)�� �� �ٿ� �ϳ��� �־�����. 
	���� �ð� ���� ������ �־�����.
 * ���
	Q���� �ٿ� 1�� �������� Q�� �������� �ش� �ð�(��)�� �θ��� �Ǻ��� ��ȣ�� ����Ѵ�.
 */
public class ArrayEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �Ǻ� ��
		int Q = sc.nextInt(); // ���� ��
		int[] n = new int[N];
		int[] t = new int[Q];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) { // N���� �Ǻ��� ���� �����ϴ� �ð�
			n[i] = sc.nextInt();
			for(int j=0; j<n[i]; j++)
				list.add(i+1);
		}
		for (int i = 0; i < Q; i++) { // Q���� �ٿ� �˰��� �ϴ� Q���� �ð�
			t[i] = sc.nextInt();
			System.out.println(list.get(t[i]));
		}
		sc.close();
	}
}
