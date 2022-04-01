package basic.dfsnbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex2606_2 {
    static int numberOfComputers, numberOfPairs;
    static int[][] map;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numberOfComputers = Integer.parseInt(br.readLine());
        numberOfPairs = Integer.parseInt(br.readLine());

        map = new int[numberOfComputers+1][numberOfComputers+1];
        visit = new boolean[numberOfComputers+1];

        for(int i = 0; i < numberOfPairs; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }

        System.out.println(bfs(1));
    }

    private static int bfs(int start) {
        int cnt = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visit[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 1; i <= numberOfComputers; i++) {
                if (map[cur][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    cnt++;
                    q.offer(i);
                }
            }
        }

        return cnt;
    }
}
