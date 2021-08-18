package basic.array;

import java.util.Scanner;
/* 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
 * 둘째 줄에 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫번째 입력값을 길이로 하는 배열 생성.
		int[] arr = new int[sc.nextInt()];
		int max = 0;
		double sum = 0;
		// 배열에 점수 입력
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			// 최대값 비교
			if(max < arr[i]) {
				max = arr[i];
			}
			// 총합
			sum += arr[i];
		}
		
		// 합계 / 최고점*100 / 과목 수
		System.out.println((sum/max)*100/arr.length);
		sc.close();
	}
}
