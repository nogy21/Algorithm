package basic.math2;

import java.util.Scanner;

public class Math03_ex11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				N /= i;
				System.out.println(i);
			}
		}
		if(N!=1)
			System.out.println(N);
	}
}