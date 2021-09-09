package basic.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Math09_ex1011 {
	public static void main(String[] args) throws IOException {
		//Scanner보다 효율적인 처리를 위해 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//한 줄에 공백을 두고 입력받기에 StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());//올라감
		int B = Integer.parseInt(st.nextToken());//내려감
		int V = Integer.parseInt(st.nextToken());//나무막대길이
		int D = 0;// 도착일
		if((V-B)%(A-B)==0)// A*D - B*(D-1) >= V
			D = (V-B)/(A-B);
		else
			D = (V-B)/(A-B)+1;
		System.out.println(D);
	}
}