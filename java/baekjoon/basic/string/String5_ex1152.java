package basic.string;

import java.util.Scanner;

public class String5_ex1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");// 앞 뒤로 공백이 있을 수 있다.
		int result = arr.length;// 결과값의 기본값으로 배열의 길이를 저장
		for(int i=0; i<arr.length; i++) {// 입력받은 값의 맨 앞, 뒤에 공백이 있을 경우 확인
			if(arr[i].equals(""))// 존재할 경우 결과값에서 -1
				result -= 1;
		}
		System.out.println(result);
		sc.close();
	}
}
