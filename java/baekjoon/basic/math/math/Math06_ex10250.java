package basic.math;

import java.util.Scanner;

public class Math06_ex10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();// ��
			int W = sc.nextInt();// �� ȣ��
			int N = sc.nextInt();// N��° ��

			if (N % H == 0) {
				System.out.println((H*100)+(N/H));
			} else {
				System.out.println((N % H) * 100 + N / H + 1);
			}
		}
		sc.close();
	}
}