package basic.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Math09_ex1011 {
	public static void main(String[] args) throws IOException {
		//Scanner���� ȿ������ ó���� ���� BufferedReader ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�� �ٿ� ������ �ΰ� �Է¹ޱ⿡ StringTokenizer ���
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());//�ö�
		int B = Integer.parseInt(st.nextToken());//������
		int V = Integer.parseInt(st.nextToken());//�����������
		int D = 0;// ������
		if((V-B)%(A-B)==0)// A*D - B*(D-1) >= V
			D = (V-B)/(A-B);
		else
			D = (V-B)/(A-B)+1;
		System.out.println(D);
	}
}