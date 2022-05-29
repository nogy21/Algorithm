/*
10진 정수 1개(0 ~ 255 범위)가 입력된다.
아스키코드 값을 문자로 출력한다.
 */
import java.util.Scanner;
public class Ex1037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		char b = (char)a;
		System.out.println(b);
	}

}
