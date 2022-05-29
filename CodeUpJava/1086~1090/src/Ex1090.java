import java.util.*;
public class Ex1090 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		long n = scan.nextLong();
		long result = (long)(a*Math.pow(r, n-1));
		System.out.println(result);
		scan.close();
	}

}