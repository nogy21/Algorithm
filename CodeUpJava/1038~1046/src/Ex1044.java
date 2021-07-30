/*
	정수를 1개 입력받아 1만큼 더해 출력해보자.
	단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 */
import java.util.Scanner;
public class Ex1044 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		System.out.println(++a);
	}
}