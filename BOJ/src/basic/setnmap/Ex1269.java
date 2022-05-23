package basic.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 대칭 차집합 (https://www.acmicpc.net/problem/1269)
 * : 자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 
 *  이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오. 
 *  두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
 * 
 * 아이디어
 * : 맵 사용. 같은 수 카운트 후 A와 B의 개수에서 각각 빼줌
 */
public class Ex1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        st = new StringTokenizer(br.readLine());
        int sameCnt = 0;
        for (int i = 0; i < B; i++) {
            int tmp = map.getOrDefault(Integer.parseInt(st.nextToken()), 0);
            if (tmp == 1) sameCnt++;
        }

        System.out.println(A + B - 2 * sameCnt);
    }
}
