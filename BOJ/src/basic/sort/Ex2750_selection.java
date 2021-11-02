package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ���ĺ��� ���� ������ 2�� �� ���� �� ������ �ð����⵵�� �Ȱ��� O(n^2)
//���� DB ���� �Ǹ��� �˰���
//���� ���� ���� ����ؼ� ��ġ�ؾ� �� �ε��� ���� ����
public class Ex2750_selection {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		selectionSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] selectionSort(int[] arr) {
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			int tmpv = arr[i], tmpi = i;
			for (int j = i + 1; j < l; j++) {
				if (arr[j] < tmpv) {
					tmpv = arr[j];
					tmpi = j;
				}
			}
			arr[tmpi] = arr[i];
			arr[i] = tmpv;
		}
		return arr;
	}
}
