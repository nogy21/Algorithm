/*
����(red), �ʷ�(green), �Ķ�(blue) ���� ����
���� ���� ���� ���� ����� ������ �Ѵ�.

����(r), �ʷ�(g), �Ķ�(b) ������ ���� ������ �־��� ��,
(���� ���࿡ ���� 0 ~ n-1 ���� n������ �� ������ ���� �� �ִ�.)

�־��� rgb ������ �ٸ��� ���� ���� �� �ִ� ��� ����� ����(r g b)��
�� ���� ���� ����غ���.
*/
import java.util.Scanner;
public class Ex1085 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double h = scan.nextDouble();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int s = scan.nextInt();
		
		double result = (h*b*c*s) / 8 / 1024 / 1024;
		System.out.printf("%.1f MB", result);
	}

}
