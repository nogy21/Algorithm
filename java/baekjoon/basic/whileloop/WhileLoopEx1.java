package basic.whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhileLoopEx1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// �Ϲ������� StringBuilder�� ���� �����常 �����ϱ⿡ �� ������� �ʴ´ٰ� �Ѵ�. 
		// ��� ����ϴ��� �˾Ƹ� ����.
		// ST_���� ���� ���� �����ߴ�. https://st-lab.tistory.com/30
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");  // ������ �������� �Է¹���
			int A = Integer.parseInt(st.nextToken());  // ���������� �ԷµǱ⿡ ������ ��ȯ
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {  // �Է¹��� ���� 0 0�� ��� �ߴ�
				break;
			}
			sb.append((A+B)).append('\n');  // sb�� A+B�� ���� �����ϸ� ���� �ٲ�� �ϱ⿡ \n �߰� ����
		}
		System.out.println(sb);  // �ݺ����� ����Ǹ� sb�� ��Ƶ״� ������ �� ���� ���
	}
}
