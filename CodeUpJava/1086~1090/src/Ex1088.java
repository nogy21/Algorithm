import java.util.Scanner;
public class Ex1088 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			if(i%3==0)
				continue;
			System.out.print(i +" ");
		}
		scan.close();
	}

}