import java.util.Scanner;
public class Ex1087 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(sum >= n) {
				System.out.println(sum);
				break;
			}

		}
	}

}