package basic.math2;

import java.util.Scanner;

public class Math01_1_ex1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (isPrime(a))count++;
		}
		System.out.println(count);
		sc.close();
	}

	public static boolean isPrime(int a) {
		if(a<2)
			return false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
}