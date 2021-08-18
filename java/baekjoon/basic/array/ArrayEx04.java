package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
/*
 * 자연수 10개를 입력받아 각각 42로 나눈 나머지를 구하고 
 * 서로 다른 값이 몇 개 있는지 출력한다.
 */
public class ArrayEx04 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		// HashSet은 중복된 수를 저장하지 않는다.
		// 입력받은 숫자를 int형으로 전환한 후 42로 나눠 나머지를 저장. 중복된 수는 저장하지 않음
		for(int i=0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(set.size());
	}
}
