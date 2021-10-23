package basic.array;

import java.util.Scanner;
public class ArrayEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  
		
		for(int i=0; i<t; i++) {  
			String answers = sc.next();  
			int cnt = 0; 
			int sum = 0;
			for(int j=0; j<answers.length();j++) { 
				if(answers.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}		
		sc.close();
	}
}
