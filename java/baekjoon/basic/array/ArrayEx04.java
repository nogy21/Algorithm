package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
/*
 * �ڿ��� 10���� �Է¹޾� ���� 42�� ���� �������� ���ϰ� 
 * ���� �ٸ� ���� �� �� �ִ��� ����Ѵ�.
 */
public class ArrayEx04 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		// HashSet�� �ߺ��� ���� �������� �ʴ´�.
		// �Է¹��� ���ڸ� int������ ��ȯ�� �� 42�� ���� �������� ����. �ߺ��� ���� �������� ����
		for(int i=0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(set.size());
	}
}
