package basic.string;

import java.util.Scanner;

public class String6_ex2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// 테스트 케이스 개수
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();// 반복 횟수
			String str = sc.next();// 테스트 케이스
			for (int j = 0; j < str.length(); j++) {// 문자열 길이만큼 반복
				for (int k = 0; k < r; k++) {// index j에 해당하는 문자를 입력한 반복 횟수만큼 출력
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
