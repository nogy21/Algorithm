package basic.string;

import java.util.Scanner;

public class String10_ex1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = N;
		int ans = tmp;
		for (int i = 0; i <= N; i++) {// 입력받는 횟수만큼 반복
			boolean arr[] = new boolean[26];// 알파벳, 매번 초기화
			String word = sc.nextLine();// 타겟 문자열
			for (int j = 1; j < word.length(); j++) {// 문자열 길이만큼 반복
				if (word.charAt(j - 1) != word.charAt(j)) {// 지금 문자와 다음 문자가 다르다면
					if (arr[word.charAt(j) - 97] == true) {// 그리고 전에 나온 문자라면 아웃
						ans--;
						break;// 다시 확인할 필요 x
					} else
						arr[word.charAt(j - 1) - 97] = true;// 현재 문자 true로 할당
				}
			}
		}
		sc.close();
		System.out.println(ans);
	}
}