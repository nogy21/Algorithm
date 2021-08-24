package basic.string;

import java.util.Scanner;

public class String7_ex5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i) - 65;
			if (tmp < 18) {// A~R
				tmp = tmp / 3 + 3;
				result += tmp;
			}else if(tmp==18) {// S
				result += tmp/3 +2;
			}else if(tmp<22) {// TUV
				result += 9;
			}else {// WXYZ
				result += 10;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
