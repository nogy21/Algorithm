import java.util.Scanner;

public class Ex1098 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(); //height, 2��
		int w = scan.nextInt(); //width, 1��
		int[][] arr = new int[h][w]; // n1*n2 ������, 2���� �迭 ����
		int n = scan.nextInt(); // ���� �Ѱ���
		// �迭�� �� �Է�
		for(int i = 0; i < n; i++) {
			int l = scan.nextInt(); // length, ���� ����
			int d = scan.nextInt(); // direction, ���� ����
			// ���� ���� ����
			int x = scan.nextInt(); // y�� ��, 2���� �迭
			int y = scan.nextInt(); // x�� ��, 1���� �迭
			// ����, ����
			if(d == 0) {  // ����
				for(int j = y; j < y + l;j++) {
					arr[x-1][j-1] = 1;
				}
			}else {  // ����
				for(int j = x; j < x + l; j++) {
					arr[j-1][y-1] = 1; // �Է� ������ 3 1 2 3 ���� Ȯ��
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