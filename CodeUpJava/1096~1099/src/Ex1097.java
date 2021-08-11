import java.util.Scanner;

public class Ex1097 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[19][19]; // 19x19 바둑판, 2차원 배열 생성

		// 한 줄씩 바둑판 입력 -> 배열에 넣기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int count = scan.nextInt(); // 뒤집는 횟수

		for (int i = 0; i < count; i++) {
			int x = scan.nextInt() - 1; // 배열 위치에 집어넣어야 해서 미리 -1
			int y = scan.nextInt() - 1;

			for (int j = 0; j < arr.length; j++) { // 가로열 뒤집기
				if (arr[x][j] == 0)
					arr[x][j] = 1;
				else
					arr[x][j] = 0;
			}
			for (int k = 0; k < arr.length; k++) { // 세로열 뒤집기
				if (arr[k][y] == 0)
					arr[k][y] = 1;
				else
					arr[k][y] = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) { // 저장된 값 출력
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}