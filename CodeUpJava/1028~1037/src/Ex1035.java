/*
16�� ���� 1���� �Էµȴ�.
(��, 16������ ���� �ҹ��ڷ� �Էµȴ�.)
8������ �ٲپ� ����Ѵ�.
 */
import java.util.Scanner;
public class Ex1035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		int a = Integer.parseInt(x, 16); 
		System.out.println(String.format("%o", a));
	}

}
