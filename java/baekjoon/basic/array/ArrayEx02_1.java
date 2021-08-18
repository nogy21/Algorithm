package basic.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 9개의 서로 다른 자연수가 주어질 때, 
 * 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 
 * 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 */
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