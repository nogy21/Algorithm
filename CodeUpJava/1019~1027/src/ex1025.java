/*
�ټ� �ڸ��� �̷���� 1���� ������ �Է¹޴´�.
(��, 10,000 <= �Է¹޴� �� <= 99,999 )
�� �ڸ��� ���ڸ� �и��� �� �ٿ� �ϳ��� [ ]�ӿ� �־� ����Ѵ�.
*/
import java.util.Scanner;
public class ex1025 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("");
		int i, j;
		for(i=0; i < arr.length; i++) {
			System.out.print("["+arr[i]);
			for(j = arr.length -1; j > i; j--)
				System.out.print("0");
			System.out.println("]");
		}
	}
}