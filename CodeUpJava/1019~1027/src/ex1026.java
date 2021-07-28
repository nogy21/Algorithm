/*
시 분 초가
시:분:초 형식으로 입력된다.
분만 출력한다.
*/
import java.util.Scanner;
public class ex1026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split(":");
		System.out.println(Integer.parseInt(arr[1]));
		
	}

}