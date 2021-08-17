package basic.whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhileLoopEx1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// 일반적으로 StringBuilder는 단일 쓰레드만 지원하기에 잘 사용하지 않는다고 한다. 
		// 어떻게 사용하는지 알아만 두자.
		// ST_님의 글을 통해 공부했다. https://st-lab.tistory.com/30
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");  // 공백을 기준으로 입력받음
			int A = Integer.parseInt(st.nextToken());  // 문자형으로 입력되기에 정수형 변환
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {  // 입력받은 값이 0 0일 경우 중단
				break;
			}
			sb.append((A+B)).append('\n');  // sb에 A+B의 값을 저장하며 줄을 바꿔야 하기에 \n 추가 저장
		}
		System.out.println(sb);  // 반복문이 종료되면 sb에 담아뒀던 값들을 한 번에 출력
	}
}
