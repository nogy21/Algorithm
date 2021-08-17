package basic.whileloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * EOF(End of file) 발생 문제이다.
 * Scanner 메소드의 경우 try-catch문이나 hasNext()로 처리할 수 있다.
 * (참고, IDE에서는 공백을 에러로 판단하지 않는다. 종료를 원할 시 ctrl + z를 누른다)
 * BufferedReader를 사용할 경우 반환값이 null인지 판단한다.
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
