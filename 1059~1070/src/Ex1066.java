/*
1066. �� ���� a, b, c�� �ԷµǾ��� ��, ¦(even)/Ȧ(odd)�� ����غ���.
*/
import java.util.Scanner;
public class Ex1066 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		if (b % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		if (c % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		scan.close();
	}
}
