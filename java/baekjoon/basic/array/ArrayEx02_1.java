package basic.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 9���� ���� �ٸ� �ڿ����� �־��� ��, 
 * �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���, ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61 �� �־�����, 
 * �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
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