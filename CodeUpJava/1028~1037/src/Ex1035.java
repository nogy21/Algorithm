/*
16진 정수 1개가 입력된다.
(단, 16진수는 영문 소문자로 입력된다.)
8진수로 바꾸어 출력한다.
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
