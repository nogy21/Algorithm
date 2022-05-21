package basic.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 문자열 집합 (https://www.acmicpc.net/problem/14425)
 */
public class Ex14425_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> inputs = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            inputs.put(br.readLine(), 1);
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            String sample = br.readLine();
            answer += inputs.getOrDefault(sample, 0);
        }

        System.out.println(answer);
    }
}
