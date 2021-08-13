package basic.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForLoopEx11_2 {
	public static void main(String[] args) throws IOException {
		//BufferedReader&Writer 사용한 버전
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 수열을 입력받아야 하기 때문에 StringTokenizer 사용. 구분자는 공백
		
		int N = Integer.parseInt(st.nextToken()); // 배열 크기, 예문 입력값이 대문자여서 그대로 진행
		int X = Integer.parseInt(st.nextToken()); // 비교할 값

		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < X) bw.write(num+" ");
		}
		bw.flush();
		bw.close();
	}
}