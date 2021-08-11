import java.util.Scanner;

public class Ex1096 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[20][20];
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr[x][y] = 1;
		}
		for (int j = 1; j < arr.length; j++) {
			for (int k = 1; k < arr.length; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}

		scan.close();
	}
}