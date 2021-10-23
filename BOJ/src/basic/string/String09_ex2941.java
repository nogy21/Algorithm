package basic.string;

import java.util.Scanner;

public class String09_ex2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().trim();
		sc.close();
		int count = 0;
		String[] crt = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };//�迭 ����
		for (int i = 0; i < crt.length; i++) {
			if (str.contains(crt[i])) {
				str = str.replaceAll(crt[i], " ");
			}
		}
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		str = str.replaceAll(" ", "");
		count += str.length();
		
		System.out.println(count);
	}
}