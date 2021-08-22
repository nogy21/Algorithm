package basic.method;

import java.util.Scanner;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력) 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
출력) 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

public class Method3_ex1066_charAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), cnt = 0;
        sc.close();
		if (N <= 99) 
			cnt += N; // 100 미만의 자연수 그대로 반환
		else 
			cnt += 99;
		for (int i = 100; i <= N; i++) {
			String str = Integer.toString(i);  // 문자열 위치로 확인하기 위해 String 타입 변수 생성
			int diff = str.charAt(1) - str.charAt(0);  // 십의 자리, 일의 자리수의 차
			boolean flag = true;
			for(int j = 1; j < str.length()-1; j++) {  // diff 값을 이미 구했으므로 1부터 길이 -1만큼 반복
				if(str.charAt(j+1) - str.charAt(j) != diff) {  // 백의 자리와 십의 자리 수의 차; 한수가 아닐 경우 false
					flag = false;
					break;
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
	}
}