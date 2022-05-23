package basic.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 듣보잡 (https://www.acmicpc.net/problem/1764)
 * : 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
 */
public class Ex1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputCaseNumbers = br.readLine().split(" ");
        int N = Integer.parseInt(inputCaseNumbers[0]);
        int M = Integer.parseInt(inputCaseNumbers[1]);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String neverHeard = br.readLine();
            map.put(neverHeard, 1);
        }

        int cnt = 0;
        ArrayList<String> neverHeardAndSeen = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String neverSeen = br.readLine();
            int tmp = map.getOrDefault(neverSeen, 0);
            if (tmp != 0) {
                cnt++;
                neverHeardAndSeen.add(neverSeen);
            }
        }

        Collections.sort(neverHeardAndSeen);

        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        for (String name : neverHeardAndSeen) {
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
}
