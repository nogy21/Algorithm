package basic.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */
public class ArrayEx01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int min = arr.get(0);
		int max = arr.get(0);
		for(int i=0; i<arr.size();i++) {
			if (arr.get(i) > max)
				max = arr.get(i);
			if(arr.get(i) < min)
				min = arr.get(i);
		}
		System.out.println(min + " " + max);
		
	}
}
