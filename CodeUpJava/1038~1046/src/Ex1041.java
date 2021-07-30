/*
	영문자 1개를 입력받아 그 다음 문자를 출력해보자.
	영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
 */
import java.util.Scanner;
public class Ex1041 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		System.out.println((char)(a+1));
	}
}