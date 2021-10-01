package basic.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math09_ex1011 {
	public static void main(String[] args) throws IOException {
		// Scanner보다 효율적인 처리를 위해 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 한 줄에 공백을 두고 입력받기에 StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for (int i = 0; i < T; i++) {
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dist=1;
			dist=y-2;
		}
	}
}