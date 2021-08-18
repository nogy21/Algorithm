package basic.array;

import java.util.Scanner;
/* "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 * 
 */
public class ArrayEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  // 퀴즈 수
		
		for(int i=0; i<t; i++) {  // 퀴즈 수만큼 반복
			String answers = sc.next();  // 새로운 퀴즈마다 답을 입력받음
			int cnt = 0;  // 정답 횟수를 저장
			int sum = 0;  // 총점을 저장
			for(int j=0; j<answers.length();j++) {  // 퀴즈 정답에 따라 점수
				if(answers.charAt(j) == 'O') {  // 정답일 경우
					cnt++;  // 정답 수를 증가
					sum += cnt;  // 맞은 경우 연속된 수만큼 점수가 올라가기에 총점에 계속해서 cnt를 누적
				}
				else {
					cnt = 0;  // 틀린 경우 누적된 cnt를 초기화
				}
			}
			System.out.println(sum);
		}		
		sc.close();
	}
}
