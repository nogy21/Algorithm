package basic.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DijkstraTest {
    public static final int INF = (int) 1e9; // 무한을 의미하는 값, 10억
    // 노드 개수(N), 간선 개수(M), 시작 노드 번호(start)
    public static int n, m, start;
    // 각 노드에 연결된 노드에 대한 정보를 담는 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // 최단 거리 테이블
    public static int[] d = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // a번 노드에서 b번 노드로 가는 비용이 c
            graph.get(a).add(new Node(b, c));
        }

        // 테이블 초기화
        Arrays.fill(d, INF);

        dijkstra(start);

        // 모든 노드로 가기 위한 최단 거리 출력
        for (int i = 1; i <= n; i++) {
            // 도달할 수 없는 경우
            if (d[i] == INF) {
                System.out.println("INFINITY");
            } else {
                System.out.println(d[i]);
            }
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // 시작 노드로 가기 위한 최단 경로 -> 0으로 설정, 큐에 삽입
        pq.offer(new Node(start, 0));
        d[start] = 0;

        while (!pq.isEmpty()) {
            // 가장 최단 거리 짧은 노드
            Node node = pq.poll();
            int dist = node.getDistance();
            int now = node.getIndex();
            // 현재 노드가 이미 처리된 경우 스킵
            if (d[now] < dist) {
                continue;
            }
            // 현재 노드와 연결된 다른 인접한 노드 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + graph.get(now).get(i).getDistance();
                // 현재 노드를 거쳐 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        private int index;
        private int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int getIndex() {
            return index;
        }

        public int getDistance() {
            return distance;
        }

        // 거리(비용)가 짧은 것이 높은 우선순위
        @Override
        public int compareTo(Node other) {
            return this.distance - other.distance;
        }
    }
}
