package prtstars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2444 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		prtStars(N);
	}

	private static void prtStars(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n) {
				for(int j=i+1;j<n;j++)
	    			System.out.print(" ");
	    		for(int k=0;k<(i)*2+1;k++)
	    			System.out.print("*");
	    		System.out.println();
			} else {
				for(int j=0;j<=i-n;j++)
	    			System.out.print(" ");
	    		for(int k=1;k<(2*n-i)*2-2;k++)
	    			System.out.print("*");
	    		System.out.println();
			}

		}
	}
}