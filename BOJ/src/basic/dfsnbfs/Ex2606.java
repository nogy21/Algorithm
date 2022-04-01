package basic.dfsnbfs;

import java.io.*;
import java.util.*;

public class Ex2606 {
    static int[][] map;
    static int numberOfNodes, numberOfLines, count = 0;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드, 간선 개수 입력
        numberOfNodes = Integer.parseInt(br.readLine());
        numberOfLines = Integer.parseInt(br.readLine());

        // 초기화
        map = new int[numberOfNodes + 1][numberOfNodes + 1];
        check = new boolean[numberOfNodes + 1];

        // 연결된 노드 입력
        for (int i = 0; i < numberOfLines; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        dfs(1); // 1번 컴퓨터부터 시작 (이미 바이러스에 걸렸음)
        System.out.println(count - 1); // 1번 제외
    }

    private static void dfs(int startWith) {
        check[startWith] = true;
        count++;

        // 해당 노드와 연결된 노드 && 방문하지 않은 노드에 대해 dfs
        for (int i = 1; i <= numberOfNodes; i++) {
            if (map[startWith][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
}
