package basic.math;

import java.util.Scanner;

public class Math01_ex1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fixedCost = sc.nextInt();
		int varCost = sc.nextInt();
		int price = sc.nextInt();
		sc.close();
		
		int bec = fixedCost / (price - varCost) + 1;
		if (price <= varCost)
			System.out.println("-1");
		else
			System.out.println(bec + 1);
	}
}