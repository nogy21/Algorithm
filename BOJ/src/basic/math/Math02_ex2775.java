package basic.math;

import java.util.Scanner;

public class Math02_ex2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] arr = new int[15][14];
		for (int i = 0; i < 14; i++) {
			arr[0][i] = i+1;
			arr[i][0] = 1;
		}
		arr[14][0] = 1;
        int[] res = new int[t];
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++)
				arr[i][j - 1] = arr[i][j - 2] + arr[i - 1][j - 1];
		}
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			res[i] = arr[k][n-1];                                                
        }
        
        sc.close();
        
        for(int i : res) {
            System.out.println(i);
        }
	}
}