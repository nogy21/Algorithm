/*
정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
*/
import java.util.Scanner;
public class Ex1067 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a < 0)
			System.out.println("minus");
		else if(a > 0)
			System.out.println("plus");
		if (a % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		scan.close();
	}
}
