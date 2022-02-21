package basic.dfsnbfs;

import java.io.*;
import java.util.*;

/**
 * 단지번호붙이기(https://www.acmicpc.net/problem/2667) dfs
 */
public class Ex2667_2 {
    static int n, cnt, apartmentNum = 0;
    private static ArrayList<Integer> apartments = new ArrayList<Integer>();
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    cnt = 0;
                    apartmentNum++;
                    dfs(i, j);
                    apartments.add(cnt);
                }
            }
        }

        System.out.println(apartmentNum);

        Collections.sort(apartments);
        for (int apartment : apartments) {
            System.out.println(apartment);
        }
    }

    private static void dfs(int x, int y) {
        cnt++;
        map[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }
            if (map[nx][ny] != 1) {
                continue;
            }
            dfs(nx, ny);
        }
    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }
}
