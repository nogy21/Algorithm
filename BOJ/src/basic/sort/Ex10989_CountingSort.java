package basic.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 
 * Counting Sort
 * Initialize counting array to all zeros.
 * Count the number of times each value occurs in the input.
 * Modify the counting array to give the number of values smaller than index
 * Transfer numbers from input to output array at locations provided by counting array
 */
public class Ex10989_CountingSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] cnt = new int[10001];
		for (int i = 0; i < 10001; i++) {
			cnt[i] = 0;
		}
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cnt[arr[i]]++;
		}
		for (int i = 0; i < cnt.length; i++) {
			while(cnt[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
