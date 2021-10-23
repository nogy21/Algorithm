package basic.math2;

import java.util.Scanner;

public class Math02_ex2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();//min
		int N = sc.nextInt();//max
		sc.close();
		int total = -1;
		int min = 10001;
		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				total+=i;
				if(i<min)min = i;
			}
		}
		if(total==-1) {
			System.out.println(total);
		}
		else {
			total+=1;
			System.out.println(total);
			System.out.println(min);
		}
			
		
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