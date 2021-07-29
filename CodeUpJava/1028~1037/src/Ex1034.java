/*
8진 정수 1개가 입력된다.
10진수로 바꾸어 출력한다.
 */
import java.util.Scanner;
public class Ex1034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String oct = scan.next();
		int a = Integer.parseInt(oct, 8); 
		System.out.println(a);
	}
}
