import java.util.Scanner;

public class Ex1094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = n; i > 0; i--) {
			System.out.printf(arr[i-1] + " ");
		}

		scan.close();
	}

}