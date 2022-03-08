package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 양 구출 작전(https://www.acmicpc.net/problem/16437)
 * 참고 풀이(https://loosie.tistory.com/492)
 */
public class Ex16437 {
    static List<Integer>[] list;
    static long[] animalNumList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        list = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        animalNumList = new long[n + 1];
        StringTokenizer st;
        for (int i = 2; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            char sheepOrWolf = st.nextToken().charAt(0);
            int animalNum = Integer.parseInt(st.nextToken());
            int nodeNum = Integer.parseInt(st.nextToken());

            list[nodeNum].add(i);
            if (sheepOrWolf == 'W') {
                animalNum *= -1;
            }
            animalNumList[i] = animalNum;
        }

        dfs(1, -1);
        System.out.println(animalNumList[1]);
    }

    private static void dfs(int idx, int pa) {
        for (int nxt : list[idx]) {
            dfs(nxt, idx);
        }
        if (pa != -1) {
            if (animalNumList[idx] > 0) {
                animalNumList[pa] += animalNumList[idx];
            }
        }
    }
}
