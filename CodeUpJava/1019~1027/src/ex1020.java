/*
주민번호는 다음과 같이 구성된다.
XXXXXX-XXXXXXX
앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
주민번호를 입력받아 형태를 바꿔 출력해보자.
'-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
*/
import java.util.Scanner;
public class ex1020 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("-");
		String yymmdd = arr[0];
		String secured = arr[1];
		System.out.printf("%s%s", yymmdd, secured);
	}
}