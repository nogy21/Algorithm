package basic.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 좌표 정렬하기 (https://www.acmicpc.net/problem/11650)
 * : 2차원 평면 위의 점 N개가 주어진다. 좌표를 x 좌표가 증가하는 순으로, x 좌표가 같으면 y 좌표가 증가하는 순서로 정렬한 다음 출력
 */
public class Ex11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Node> arr = new ArrayList<Node>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        // 정렬
        Collections.sort(arr, ((o1, o2) -> o1.compareTo(o2)));

        // 출력
        for (Node node : arr) {
            sb.append(node.x).append(" ").append(node.y).append("\n");
        }
        System.out.println(sb);
    }

    private static class Node implements Comparable<Node> {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o) {
            // x좌표 증가
            int ret = this.x - o.x;
            // x좌표 값 같은 경우 y좌표 증가
            if (ret == 0) {
                ret = this.y - o.y;
            }
            return ret;
        }
    }
}
