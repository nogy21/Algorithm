/*
	입력된 정수의 부호를 바꿔 출력해보자.
	단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
	
	참고
	단항 연산자인 -(negative)를 변수 앞에 붙이면 부호가 반대로 바뀌어 계산된다.
	----------------------------------------------------------
	정수 1개가 입력된다.
	
	부호를 바꿔 출력한다.
 */
import java.util.Scanner;
public class Ex1040 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(-scan.nextInt());
	}
}