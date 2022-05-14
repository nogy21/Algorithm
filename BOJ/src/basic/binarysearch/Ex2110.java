package basic.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 공유기 설치 (https://www.acmicpc.net/problem/2110)
 * :  N개가 수직선 위에 있다. 집에 공유기 C개를 설치하려고 한다. 가장 인접한 두 공유기 사이의 거리를 최대로 하는 프로그램을 작성하시오.
 *
 * 아이디어
 * : 이분탐색. 설치 거리의 최소값, 최대값, 중간값을 활용. 
 *  첫 번째 집은 반드시 설치, 중간값으로 설치 가능 개수 알아보며 목표 개수와 비교 후 최소 최대값 조정
 */
public class Ex2110 {
    static int[] house;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        house = new int[N];
        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(house);

        int lo = 1; // 최소 거리
        int hi = house[N - 1] - house[0] + 1; // 최대 거리

        while (lo < hi) {
            int mid = (hi + lo) / 2;

            if (findInstallableCount(mid) < C) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(lo - 1);
    }

    private static int findInstallableCount(int dist) {
        int cnt = 1;
        int lastLoc = house[0];

        for (int i = 1; i < house.length; i++) {
            int loc = house[i];

            if (loc - lastLoc >= dist) {
                cnt++;
                lastLoc = loc;
            }
        }
        return cnt;
    }
}
