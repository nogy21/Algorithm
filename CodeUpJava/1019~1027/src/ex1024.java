/*
�ܾ�(����) �ϳ��� �Է¹޴´�.
(��, �ܾ��� ���̴� 20�� �����̴�.)
�ܾ��� ����(����)�� �ϳ��� ������ �� �ٿ� �� ����
' '�� ��� ����Ѵ�.
*/
import java.util.Scanner;
public class ex1024 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("");
		int i;
		for(i=0; i<arr.length; i++)
			System.out.println("\'"+arr[i]+"\'");
	}
}