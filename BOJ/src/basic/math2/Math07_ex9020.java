package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Math07_ex9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());//test case
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());//Â¦¼ö
			ArrayList<Integer> list=goldbahNum(n/2);
			System.out.println(list.get(0)+" "+list.get(1));
		}
	}
	private static ArrayList<Integer> goldbahNum(int n) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		int m=n;
		while(true) {
			if(isPrimeNum(n)&&isPrimeNum(m)) {	
				list.add(n);
				list.add(m);
				break;
			}
			n--;
			m++;
		}
		return list;
	}
	private static boolean isPrimeNum(int n) {
		if(n<2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}