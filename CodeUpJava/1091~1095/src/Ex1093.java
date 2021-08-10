import java.util.Scanner;

public class Ex1093 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[23];

		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			arr[num - 1] += 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}

		scan.close();
	}

}