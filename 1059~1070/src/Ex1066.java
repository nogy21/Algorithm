/*
1066. 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
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
