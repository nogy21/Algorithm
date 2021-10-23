package basic.array;

import java.util.Scanner;
public class ArrayEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		int[] arr;  
		for(int i=0; i<t; i++) {  
			int n = sc.nextInt(); 
			arr = new int[n];  
			
			double sum = 0; 
			for(int j=0; j<n; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			double cnt = 0;
			for(int j=0; j<n; j++) {
				if(arr[j] > (sum/n))
					cnt++;
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}		
		sc.close();
	}
}
