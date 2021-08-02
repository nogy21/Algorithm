/*
점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
 90 ~  100 : A
 70 ~   89 : B
 40 ~   69 : C
  0 ~   39 : D
*/
import java.util.Scanner;
public class Ex1068 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		case 6:
		case 5:
		case 4:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		scan.close();
	}
}
