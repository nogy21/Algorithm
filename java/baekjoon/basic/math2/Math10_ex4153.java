package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Math10_ex4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0)break;
			if(a > b && a > c) {
				isARightTriangle(a,b,c);
			}else if( b > a && b > c) {
				isARightTriangle(b,a,c);
			}else {
				isARightTriangle(c,a,b);
			}
		}
	}
	public static void isARightTriangle(int a, int b, int c) {
		if(a*a == b*b + c*c) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}
}