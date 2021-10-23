package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Math11_ex3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r= Double.parseDouble(br.readLine());
		String u = String.format("%.6f",EuclidianGeometryCircleArea(r));
		String t = String.format("%.6f",TaxiCabGeometryCircleArea(r));
		System.out.println(u+"\n"+t);
	}
	public static double EuclidianGeometryCircleArea(double a) {
		return Math.PI*a*a;
	}
	public static double TaxiCabGeometryCircleArea(double a) {
		return 2*a*a;
	}
}