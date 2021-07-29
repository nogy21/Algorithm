/*
10진수 1개가 입력된다.
16진수(대문자)로 출력한다.
 */
import java.util.Scanner;
public class Ex1033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(String.format("%X", a));
	}

}
