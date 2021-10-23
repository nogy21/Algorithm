package basic.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Math03_ex10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		BigInteger ba = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		System.out.println(ba.add(bb));
        sc.close();
	}
}