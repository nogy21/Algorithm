/*
	정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
	(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
	2개의 정수가 공백으로 구분되어 입력된다.
	** 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
 */
import java.util.Scanner;
public class Ex1038 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextLong() + scan.nextLong());
	}
}