package basic.string;

import java.util.Scanner;

public class String03_1_ex10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(s.indexOf(c));
		}
		sc.close();
	}
}
