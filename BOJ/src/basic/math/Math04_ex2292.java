package basic.math;

import java.util.Scanner;

public class Math04_ex2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 0;
		if (N == 1)
			res = 1;
		else {
			int i = 1;
			N-=2;
			while (N>=0) {
				N = N-6*i;
				i++;
			}
			res = i;
		}
		sc.close();
		System.out.println(res);
	}
}