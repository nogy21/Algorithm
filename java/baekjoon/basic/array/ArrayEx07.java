package basic.array;

import java.util.Scanner;
/* 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
public class ArrayEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  // 테스트케이스 수
		int[] arr;  // 성적 저장할 배열 선언
		for(int i=0; i<t; i++) {  // 테스트케이스 수만큼 반복
			int n = sc.nextInt();  // 학생 수
			arr = new int[n];  // 학생 수만큼의 크기를 가지는 배열로 초기화
			
			double sum = 0;  // 성적 합계 저장
			for(int j=0; j<n; j++) {  // 점수 입력 위해 학생 수만큼 반복
				arr[j] = sc.nextInt();  // 학생 점수
				sum += arr[j];  // 성적 총합
			}
			double cnt = 0;  // 평균을 넘기는 학생 수 저장. 학생 비율을 구해야 하기에 double형으로 선언
			for(int j=0; j<n; j++) {
				if(arr[j] > (sum/n))
					cnt++;
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}		
		sc.close();
	}
}
