package basic.array;

import java.util.Scanner;
public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int max = 0;
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		
		System.out.println((sum/max)*100/arr.length);
		sc.close();
	}
}
