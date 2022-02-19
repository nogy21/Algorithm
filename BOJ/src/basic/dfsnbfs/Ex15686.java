package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 치킨 배달(https://www.acmicpc.net/problem/15686)
 */
public class Ex15686 {
    private static List<int[]> houses = new ArrayList<>();
    private static List<int[]> stores = new ArrayList<>();
    private static boolean[] isMaintainable;
    private static int n, m, answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // n개 줄의 도시 정보
        m = Integer.parseInt(st.nextToken()); // 폐업시키지 않을 치킨집 수

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == 1) {
                    houses.add(new int[]{i + 1, j + 1});
                } else if (tmp == 2) {
                    stores.add(new int[]{i + 1, j + 1});
                }
            }
        }

        isMaintainable = new boolean[stores.size()];
        combi(0, 0);
        System.out.println(answer);
    }

    private static void combi(int beginWith, int cnt) {
        if (cnt == m) {
            getDistance();
            return;
        }
        for (int i = beginWith; i < stores.size(); i++) {
            isMaintainable[i] = true;
            combi(i + 1, cnt + 1);
            isMaintainable[i] = false;
        }
    }

    private static void getDistance() {
        int totalDistance = 0;
        for (int[] house : houses) {
            int compVal = Integer.MAX_VALUE;
            for (int i = 0; i < stores.size(); i++) {
                if (isMaintainable[i]) {
                    int tmp = Math.abs(house[0] - stores.get(i)[0])
                            + Math.abs(house[1] - stores.get(i)[1]);
                    compVal = Math.min(compVal, tmp);
                }
            }
            totalDistance += compVal;
        }
        answer = Math.min(answer, totalDistance);
    }
}
