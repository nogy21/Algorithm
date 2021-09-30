package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Math08_ex1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); 
		int y = Integer.parseInt(st.nextToken()); 
		int w = Integer.parseInt(st.nextToken()); 
		int h = Integer.parseInt(st.nextToken()); 
		List<Integer> numbers = List.of(x, y, w-x, h-y);
		int min = numbers.stream().min(Integer::compare).orElse(-1);
		System.out.println(min);
	}
}