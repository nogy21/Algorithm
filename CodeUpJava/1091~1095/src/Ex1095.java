import java.util.Scanner;

public class Ex1095 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int min = 24;
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			if(arr[i]<min)
				min = arr[i];
		}
		
		System.out.println(min);
		scan.close();
	}

}