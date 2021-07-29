/*
영문자 1개가 입력된다.
아스키코드 값을 10진수로 출력한다.
 */
import java.util.Scanner;
public class Ex1036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		int b = (int)a; 
		System.out.println(b);
	}

}
