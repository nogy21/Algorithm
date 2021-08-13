package basic.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForLoopEx4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기
		// String s = br.readLine(); //String
		int T = Integer.parseInt(br.readLine()); // int 입력, T: 입력할 횟수
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 문자열을 분리해서 받기 위해 StringTokenizer() 사용
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"));
			// 각 토큰을 반환, String 타입이므로 int로 형변환. 반환받은 두 값을 더해 bw.write()에 전달. bw.write()의 경우
			// 개행을 직접 입력해야함
		}
		bw.flush(); // 남아있는 데이터를 모두 출력시킴(버퍼를 비움)
		bw.close(); // 스트림을 닫음

	}
}