package basic.sort;

import java.io.*;
import java.util.*;

/**
 * 좌표 압축(https://www.acmicpc.net/problem/18870)
 * : 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
 *   Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
 *
 * 아이디어
 * : 배열에 입력 -> 새로운 배열에 옮긴 후 정렬 -> 맵에 저장 후 기존 배열을 키로 사용해서 중복 제외한 채 출력
 */
public class Ex18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 저장
        int[] orgArr = new int[N];
        int[] copyArr = new int[N];
        int i;
        for (i = 0; i < N; i++){
            copyArr[i] = orgArr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(copyArr);

        // 맵에 배열 요소를 키, 요소의 크기 순서를 값으로 입력
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (i = 0; i < copyArr.length; i++) {
            if (!map.containsKey(copyArr[i])) {
                map.put(copyArr[i], j++);
            }
        }

        for (i = 0; i < N; i++) {
            sb.append(map.get(orgArr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
