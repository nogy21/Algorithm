package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math06_ex4948 {
	public static boolean check[] = new boolean[246913];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)	break;
			System.out.println(cntPrimeNum(n));
		}
	}

	public static int cntPrimeNum(int n) {
		check[0] = check[1] = true;
		for (int i = 2; i <= Math.sqrt(check.length); i++) {
			if (check[i]) continue;
			for (int j = i * i; j < check.length; j += i) {
				check[j] = true;
			}
		}
		int cnt = 0;
		for (int i = n+1; i <= 2 * n; i++) {
			if (!check[i]) cnt++;
		}
		return cnt;
	}
}