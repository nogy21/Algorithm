package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//삽입 정렬은 버블 정렬이나 선택 정렬보다 빠르지만 시간복잡도는 똑같이 O(n^2)
//하지만 가장 최고의 상황에서는 O(n)의 시간복잡도를 보임. 작은 DB 기준 훌륭한 알고리즘
//자기 자신을 기준으로 좌, 우 분리해서 정렬
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
				if (j < 0) // 첫 번째 index가 두 번째보다 큰 경우 음수가 나오지 않도록
					break;
			}
		}
		return arr;
	}
}
