/*
평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
평가 : 내용
A : best!!!
B : good!!
C : run!
D : slowly~
나머지 문자들 : what?
*/
import java.util.Scanner;
public class Ex1069 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char alph = scan.next().charAt(0);
		switch(alph) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
		}
		scan.close();
	}
}
