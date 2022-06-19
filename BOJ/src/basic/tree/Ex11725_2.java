package basic.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 트리의 부모 찾기 (https://www.acmicpc.net/problem/11725)
 * : 루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * : 첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.
 *
 * 출력
 * : 첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.
 *
 * 아이디어
 * : bfs
 */
public class Ex11725_2 {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        parents = new int[N + 1];

        for (int i = 0; i <= N + 1; i++) {
            list.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        bfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }

    private static void bfs(int start) {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(start);
        parents[start] = 1;

        while (!q.isEmpty()) {
            int parent = q.poll();

            for (int val : list.get(parent)) {
                if (parents[val] == 0) {
                    parents[val] = parent;
                    q.offer(val);
                }
            }
        }
    }
}