package basic.string;

import java.util.Scanner;

public class String03_ex10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {// -1로 초기화
			arr[i] = -1;
		}
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {//
			if (arr[s.charAt(i) - 'a'] == -1)
				arr[s.charAt(i) - 'a'] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
