package basic.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForLoopEx4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // �Ҵ�� ���ۿ� �� �־��ֱ�
		// String s = br.readLine(); //String
		int T = Integer.parseInt(br.readLine()); // int �Է�, T: �Է��� Ƚ��
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " "); // ���ڿ��� �и��ؼ� �ޱ� ���� StringTokenizer() ���
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"));
			// �� ��ū�� ��ȯ, String Ÿ���̹Ƿ� int�� ����ȯ. ��ȯ���� �� ���� ���� bw.write()�� ����. bw.write()�� ���
			// ������ ���� �Է��ؾ���
		}
		bw.flush(); // �����ִ� �����͸� ��� ��½�Ŵ(���۸� ���)
		bw.close(); // ��Ʈ���� ����

	}
}