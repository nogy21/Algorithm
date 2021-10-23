package basic.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayEx02_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[0];
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			if (arr[i] > max){
				max = arr[i];
				cnt = i;
            }
			if (arr[0] == max)
				cnt = 0;
		}
		System.out.println(max + " " + (cnt+1));
	}
}