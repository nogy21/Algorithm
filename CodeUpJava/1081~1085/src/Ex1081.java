/*
1���� n����, 1���� m���� ���ڰ� ����
���� �ٸ� �ֻ��� 2���� ������ �� ���� �� �ִ� ��� ��츦 ����غ���.
*/
import java.util.Scanner;
public class Ex1081 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.println(i +" "+ j);
			}
		}
		scan.close();
	}

}
