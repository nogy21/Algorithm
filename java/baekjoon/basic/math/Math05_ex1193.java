package basic.math;

import java.util.Scanner;

public class Math05_ex1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int line = 1, total = 0, ans = 0;
		
		while (true) {// 줄 위치(사선)
			total += line;
			if(total >= N)
				break;
			line++;
		}
		ans = N - total + line;// 해당 줄에서 몇 번째 위치인지
		
		if(line % 2 == 0) {
			System.out.println(ans+"/"+(line-ans+1));
		}else {
			System.out.println((line-ans+1)+"/"+ans);
		}
	}
}