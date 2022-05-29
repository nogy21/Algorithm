import java.util.Scanner;
public class Ex1086 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double w = scan.nextDouble();
		int h = scan.nextInt();
		int b = scan.nextInt();
		
		double result = (w*h*b) / 8 / 1024 / 1024;
		System.out.printf("%.2f MB", result);
	}

}