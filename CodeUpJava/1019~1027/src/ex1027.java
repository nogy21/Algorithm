/*
년월일이 '.'(닷)으로 구분되어 입력된다.
년월일을 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다.
*/
import java.util.Scanner;
public class ex1027 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("\\.");
		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
		
	}

}