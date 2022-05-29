import java.util.Scanner;

public class Ex1098 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(); //height, 2차
		int w = scan.nextInt(); //width, 1차
		int[][] arr = new int[h][w]; // n1*n2 격자판, 2차원 배열 생성
		int n = scan.nextInt(); // 막대 총개수
		// 배열에 값 입력
		for(int i = 0; i < n; i++) {
			int l = scan.nextInt(); // length, 막대 길이
			int d = scan.nextInt(); // direction, 막대 방향
			// 막대 시작 지점
			int x = scan.nextInt(); // y축 값, 2차원 배열
			int y = scan.nextInt(); // x축 값, 1차원 배열
			// 가로, 세로
			if(d == 0) {  // 가로
				for(int j = y; j < y + l;j++) {
					arr[x-1][j-1] = 1;
				}
			}else {  // 세로
				for(int j = x; j < x + l; j++) {
					arr[j-1][y-1] = 1; // 입력 예시인 3 1 2 3 으로 확인
				}
			}
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		scan.close();
	}
}