package basic.queue;

import java.io.*;
import java.util.*;

/**
 * 프린터 큐(https://www.acmicpc.net/problem/1966)
 * 아이디어
 * : 뒤에 우선순위가 높은 문서 존재 -> 현재 문서는 맨 뒤로
 * 우선순위 높은 문서 출력 시 카운트 증가,
 * 목표하는 문서가 출력될 때의 카운트 저장
 *
 * 시간복잡도
 * : 1 <= N <= 100, 0 <= M <= N
 * O(N^3) = 1,000,000
 */
public class Ex1966 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int numPages = Integer.parseInt(st.nextToken());
            int targetIdx = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numPages; j++) {
                // 입력 순서, 우선 순위
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int cnt = getPrintIndex(targetIdx, q);

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    private static int getPrintIndex(int idx, LinkedList<int[]> q) {
        int cnt = 0;

        while (!q.isEmpty()) {
            int[] firstPos = q.poll();
            boolean isPrintable = true; // 우선순위 높아 출력 가능한지

            // 가장 앞에 있는 문서와 남은 문서들의 우선순위 비교
            for (int i = 0; i < q.size(); i++) {
                // 앞 문서의 우선순위 낮은 경우 뒤로 & 출력 불가 처리
                if (firstPos[1] < q.get(i)[1]) {
                    q.offer(firstPos);
                    isPrintable = false;
                    break;
                }
            }
            
            if (!isPrintable) {
                continue;
            }

            cnt++;
            if (firstPos[0] == idx) {
                break;
            }
        }
        return cnt;
    }
}
