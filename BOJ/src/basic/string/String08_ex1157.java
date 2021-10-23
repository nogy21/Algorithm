package basic.string;

import java.util.Scanner;

public class String08_ex1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];
		String str = sc.next().toUpperCase();
		int max = -1;
		char ans = '?';
		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i) - 65;
			arr[tmp]++;
			if (max < arr[tmp]) {
				max = arr[tmp];
				ans= str.charAt(i);
			}else if(max == arr[tmp])
				ans = '?';
		}
		sc.close();
		System.out.println(ans);
	}

}
