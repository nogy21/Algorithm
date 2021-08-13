package basic.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForLoopEx11_2 {
	public static void main(String[] args) throws IOException {
		//BufferedReader&Writer ����� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// ������ �Է¹޾ƾ� �ϱ� ������ StringTokenizer ���. �����ڴ� ����
		
		int N = Integer.parseInt(st.nextToken()); // �迭 ũ��, ���� �Է°��� �빮�ڿ��� �״�� ����
		int X = Integer.parseInt(st.nextToken()); // ���� ��

		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < X) bw.write(num+" ");
		}
		bw.flush();
		bw.close();
	}
}