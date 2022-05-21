package basic.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열 집합 (https://www.acmicpc.net/problem/14425)
 */
public class Ex14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine();
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            String sample = br.readLine();
            for (String str : inputs) {
                if (str.equals(sample)) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
