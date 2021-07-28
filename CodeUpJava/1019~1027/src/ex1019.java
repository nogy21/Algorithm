/*
연월일 입력받아 그대로 출력하기
연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
*/
import java.util.Scanner;
public class ex1019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("\\.");
		int Year = Integer.valueOf(arr[0]);
		int Month = Integer.valueOf(arr[1]);
		int Day = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", Year, Month, Day);
	}
}