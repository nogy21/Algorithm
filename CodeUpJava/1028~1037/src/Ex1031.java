/*
10진수 1개가 입력된다.
단, 입력되는 정수는 int 범위이다.
8진수로 출력한다.
 */
import java.util.Scanner;
public class Ex1031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(String.format("%o", a));
	}

}
