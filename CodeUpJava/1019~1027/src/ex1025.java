/*
다섯 자리로 이루어진 1개의 정수를 입력받는다.
(단, 10,000 <= 입력받는 수 <= 99,999 )
각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
*/
import java.util.Scanner;
public class ex1025 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String[] arr = a.split("");
		int i, j;
		for(i=0; i < arr.length; i++) {
			System.out.print("["+arr[i]);
			for(j = arr.length -1; j > i; j--)
				System.out.print("0");
			System.out.println("]");
		}
	}
}