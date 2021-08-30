package basic.string;

import java.util.Scanner;

public class String09_ex2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().trim();// 공백을 활용하기 위해 미리 공백 제거
		sc.close();
		int count = 0;// 결과값
		String[] crt = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };//배열 생성
		for (int i = 0; i < crt.length; i++) {// 크로아티아 알파벳 개수만큼 반복
			if (str.contains(crt[i])) {// crt 요소값과 일치하는 문자열을 모두 공백으로 바꿈
				str = str.replaceAll(crt[i], " ");
			}
		}
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)==' ')//crt를 공백으로 치환했으므로 그만큼 count 증가
				count++;
		}
		str = str.replaceAll(" ", "");// 공백 제거
		count += str.length();// 남은 알파벳을 더함
		
		System.out.println(count);
	}
}