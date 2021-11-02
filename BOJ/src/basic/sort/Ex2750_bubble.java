package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ����: �ð����⵵ O(n^2), �� ���� ���Ͽ� �����ϴ� ���
public class Ex2750_bubble {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bubbleSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] bubbleSort(int[] arr) {
		int i = arr.length - 1;
		int tmp; 
		while (i != 0) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) { // ū ���� �ڷ�
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
			i--;
		}
		return arr;
	}
}
