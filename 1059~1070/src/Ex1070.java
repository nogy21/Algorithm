/*
월이 입력될 때 계절 이름이 출력되도록 해보자.

예
월 : 계절 이름
12, 1, 2 : winter
 3, 4, 5 : spring
 6, 7, 8 : summer
 9, 10, 11 : fall
*/
import java.util.Scanner;
public class Ex1070 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
		default:
			System.out.println("winter");
		}
		scan.close();
	}
}
