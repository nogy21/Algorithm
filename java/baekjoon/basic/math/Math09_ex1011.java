package basic.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math09_ex1011 {
	public static void main(String[] args) throws IOException {
		// Scanner���� ȿ������ ó���� ���� BufferedReader ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �� �ٿ� ������ �ΰ� �Է¹ޱ⿡ StringTokenizer ���
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