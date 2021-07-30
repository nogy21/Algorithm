/*
	정수 2개를 입력받아 합을 출력해보자.
	단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
	
	참고
	+ 연산자를 사용하면 된다.
	단, 계산된 결과가 int 형으로 저장할 수 있는 범위를 넘어갈 수 있기 때문에 다른 데이터형을 사용해야 한다.
	
	주의
	int 데이터형은 %d로 입출력하고,
	long long int 데이터형은 %lld로 입출력한다.
	
	2개의 정수가 공백으로 구분되어 입력된다.
	두 정수의 합을 출력한다.
 */
import java.util.Scanner;
public class Ex1039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextLong() + scan.nextLong());
	}
}