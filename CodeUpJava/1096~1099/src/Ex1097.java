import java.util.Scanner;

public class Ex1097 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[19][19]; // 19x19 �ٵ���, 2���� �迭 ����

		// �� �پ� �ٵ��� �Է� -> �迭�� �ֱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int count = scan.nextInt(); // ������ Ƚ��

		for (int i = 0; i < count; i++) {
			int x = scan.nextInt() - 1; // �迭 ��ġ�� ����־�� �ؼ� �̸� -1
			int y = scan.nextInt() - 1;

			for (int j = 0; j < arr.length; j++) { // ���ο� ������
				if (arr[x][j] == 0)
					arr[x][j] = 1;
				else
					arr[x][j] = 0;
			}
			for (int k = 0; k < arr.length; k++) { // ���ο� ������
				if (arr[k][y] == 0)
					arr[k][y] = 1;
				else
					arr[k][y] = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) { // ����� �� ���
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}