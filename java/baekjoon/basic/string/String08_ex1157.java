package basic.string;

import java.util.Scanner;

public class String08_ex1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];// 알파벳 개수
		String str = sc.next().toUpperCase();// 대소문자 관계 없이 입력받지만 출력은 대문자이므로 미리 변환
		int max = -1;
		char ans = '?';
		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i) - 65;
			arr[tmp]++;// 입력받은 문자열의 i번째 알파벳에 +1
			if (max < arr[tmp]) {// 최대값 갱신
				max = arr[tmp];
				ans= str.charAt(i);// 결과를 저장하는 변수에 최대값에 해당하는 문자 반환
			}else if(max == arr[tmp])
				ans = '?';// 최대값이 다른 문자의 값과 동일할 경우 ? 반환
		}
		sc.close();
		System.out.println(ans);
	}

}
