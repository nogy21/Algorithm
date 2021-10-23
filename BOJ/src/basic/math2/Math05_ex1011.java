package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math05_ex1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			flyToAlpha(y - x);
		}
	}

	private static void flyToAlpha(int x) {
		int n = (int) Math.sqrt(x);
		if (x == n * n) {
			System.out.println(2 * n - 1);
		} else if (n * n < x && x <= n*n+n) {
			System.out.println(2 * n);
		} else {
			System.out.println(2 * n + 1);
		}
	}
}