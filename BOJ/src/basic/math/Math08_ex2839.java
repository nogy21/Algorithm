package basic.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math08_ex2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		while (true) {
			if (N % 5 == 0) {
				res += N / 5;
				break;
			}
			N -= 3;
			res++;
			if(N<0) {
				res=-1;
				break;
			}
		}
		br.close();
		System.out.println(res);
	}
}