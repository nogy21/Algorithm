package basic.array;

import java.util.Scanner;

public class ArrayEx02_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 값을 곱해야 하기 때문에 우선 int형으로 입력
		int n = sc.nextInt() * sc.nextInt() * sc.nextInt();
		// 곱한 값의 자리값과 일치하는 숫자를 확인해야 하기에 String으로 변환
		String str = Integer.toString(n);
		
		for(int i=0; i<10; i++) {  // 0~9까지 각각 일치하는 숫자의 개수를 찾아야 함
			int count = 0;  // 숫자별 일치하는 횟수 저장. 저장하는 값을 숫자마다 초기화해야 하기에 for문에서 선언
			
			for(int j=0; j<str.length(); j++) {
                // '1' == 49(아스키코드, int형) 즉, '0'(48)을 빼줌으로서 원하는 인덱스의 정수형 값을 확인할 수 있음
				if((str.charAt(j)-'0')==i)
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}
