/*
������� '.'(��)���� ���еǾ� �Էµȴ�.
������� �Ͽ������� �ٲپ� '-'(�뽬, ���̳ʽ�)�� ������ ����Ѵ�.
*/
import java.util.Scanner;
public class ex1027 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("\\.");
		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
		
	}

}