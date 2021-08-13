package basic.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ForLoopEx10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for(int j = N-i-1; j > 0; j--) {
				bw.write(" ");
			}
			for(int k =N-i; k < N+1; k++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}