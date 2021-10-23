package basic.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] n = new int[N];
		int[] t = new int[Q];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
			for(int j=0; j<n[i]; j++)
				list.add(i+1);
		}
		for (int i = 0; i < Q; i++) {
			t[i] = sc.nextInt();
			System.out.println(list.get(t[i]));
		}
		sc.close();
	}
}
