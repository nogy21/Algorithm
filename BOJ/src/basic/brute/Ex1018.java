package basic.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1018 {
	public static int min = 64;
	public static String[] wb = {"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] board = new String[N];
		for (int i = 0; i < N; i++) {
				board[i] = br.readLine();
		}
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++)
				min = countDiffColor(board, i, j);
		}
		System.out.println(min);
	}

	private static int countDiffColor(String[] board, int x, int y) {
		int cnt = 0;
		for(int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
				if(board[i].charAt(j) != wb[i-x].charAt(j-y)) {
					cnt++;
				}
			}
		}
		cnt = Math.min(cnt, 64-cnt); 
		return Math.min(min, cnt);
	}

}
