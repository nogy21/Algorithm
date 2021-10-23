package basic.string;

import java.util.Scanner;

public class String04_ex2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();

		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		A = a.charAt(0)-'0' + (a.charAt(1)-'0')*10 + (a.charAt(2)-'0')*100;
		B = b.charAt(0)-'0' + (b.charAt(1)-'0')*10 + (b.charAt(2)-'0')*100;
		System.out.println(A > B ? A : B);
	}
}
