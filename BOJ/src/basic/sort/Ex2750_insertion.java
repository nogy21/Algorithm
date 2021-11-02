package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ������ ���� �����̳� ���� ���ĺ��� �������� �ð����⵵�� �Ȱ��� O(n^2)
//������ ���� �ְ��� ��Ȳ������ O(n)�� �ð����⵵�� ����. ���� DB ���� �Ǹ��� �˰���
//�ڱ� �ڽ��� �������� ��, �� �и��ؼ� ����
public class Ex2750_insertion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		insertionSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] insertionSort(int[] arr) {
		int tmp, j;
		for (int i = 0; i < arr.length - 1; i++) {
			j = i;
			while (arr[j] > arr[j + 1]) {
				tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
				j--;
				if (j < 0) // ù ��° index�� �� ��°���� ū ��� ������ ������ �ʵ���
					break;
			}
		}
		return arr;
	}
}
