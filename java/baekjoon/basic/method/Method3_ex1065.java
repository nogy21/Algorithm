package basic.method;

import java.util.Scanner;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력) 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
출력) 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

public class Method3_ex1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(hansu(sc.nextInt()));
		sc.close();
	}

	private static int hansu(int N) {
		int cnt = 0;
		if (N < 100) {  // 100 미만의 자연수는 자릿수 간의 차를 비교할 수 없음. 그대로 반환. 
			return N;
		} else {
			cnt = 99;
			for (int i = 100; i <= N; i++) {
				if ((i/10)%10 - (i / 100) == (i % 10) - (i/10)%10) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}