/*
소수점 아래 숫자가 11개 이하인 실수 1개가 입력된다.
(단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.
참고. %.11lf 를 사용하면 소수점 이하 11자리까지 출력된다.
 */
import java.util.Scanner;
public class Ex1029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double a = scan.nextDouble();
		System.out.println(String.format("%.11f", a));
	}

}
