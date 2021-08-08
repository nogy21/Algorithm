/*
빨강(red), 초록(green), 파랑(blue) 빛을 섞어
여러 가지 빛의 색을 만들어 내려고 한다.

빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)

주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
총 가짓 수를 계산해보자.
*/
import java.util.Scanner;
public class Ex1085 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double h = scan.nextDouble();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int s = scan.nextInt();
		
		double result = (h*b*c*s) / 8 / 1024 / 1024;
		System.out.printf("%.1f MB", result);
	}

}
