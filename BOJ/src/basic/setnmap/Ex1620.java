package basic.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 나는야 포켓몬 마스터 이다솜 (https://www.acmicpc.net/problem/1620)
 * : 첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 내가 맞춰야 하는 문제의 개수 M이 주어져.
 *  둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력으로 들어와.
 *  문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야해. 
 *  
 * 아이디어
 * : 맵과 배열에 입력받은 후, 출력해야 하는 대상은 첫 글자가 숫자인지 확인하여 탐색
 */
public class Ex1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        String[] arr = new String[N + 1];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            arr[i] = input;
            map.put(input, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            // 숫자
            if (input.charAt(0) - '0' < 10) {
                sb.append(arr[Integer.parseInt(input)]).append("\n");
            }
            // 문자
            else {
                sb.append(map.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
