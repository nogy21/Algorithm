/*
 * 정수 1개가 입력된다.
(단, 입력되는 정수의 범위는 0 ~ 4294967295 이다.)

입력된 정수를 그대로 출력한다.
 */
import java.util.Scanner;
public class Ex1028 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		System.out.println(Long.parseLong(a));
	}

}