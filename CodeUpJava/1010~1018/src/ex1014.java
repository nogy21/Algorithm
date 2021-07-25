/*
2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

*/
import java.util.Scanner;
public class ex1014 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
        System.out.println(b+" "+a);
	}
}