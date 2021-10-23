package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Math04_ex1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); 
		int N = Integer.parseInt(st.nextToken());
		findPrimeNumbers(M, N);
	}

	private static void findPrimeNumbers(int m, int n) {
		boolean[] arr = new boolean[n+1];
		arr[1]=true;
		for(int i=2;i<=n;i++) {
			if(arr[i]==true)
				continue;
			for(int j=2*i;j<=n;j+=i) {
				arr[j]=true;
			}
		}
		for(int i=m;i<=n;i++) {
			if(arr[i]==false)
				System.out.println(i);
		}
	}
}