/*
�򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���.
�� : ����
A : best!!!
B : good!!
C : run!
D : slowly~
������ ���ڵ� : what?
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
