package basic.whileloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * EOF(End of file) �߻� �����̴�.
 * Scanner �޼ҵ��� ��� try-catch���̳� hasNext()�� ó���� �� �ִ�.
 * (����, IDE������ ������ ������ �Ǵ����� �ʴ´�. ���Ḧ ���� �� ctrl + z�� ������)
 * BufferedReader�� ����� ��� ��ȯ���� null���� �Ǵ��Ѵ�.
 */
public class WhileLoopEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str = "";
		
		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write(A + B + "\n");
		}
		br.close();		
		bw.flush();
		bw.close();
	}
}
