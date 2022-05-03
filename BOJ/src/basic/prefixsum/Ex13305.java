package basic.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 주유소 (https://www.acmicpc.net/problem/13305)
 * : 각 도시에 있는 주유소의 기름 가격과, 각 도시를 연결하는 도로의 길이를 입력으로 받아 제일 왼쪽 도시에서 제일 오른쪽 도시로 이동하는 최소의 비용을 계산하는 프로그램
 *
 * 아이디어
 * : 첫 번째 주유소는 다음 도시까지 무조건 주유 필요. 마지막 도시는 주유 X
 * 다음 도시부터 이전 주유소들보다 저렴한 경우에만 주유.
 */
public class Ex13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] cities = new int[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            cities[i] = Integer.parseInt(st.nextToken());
        }

        int[] oilPrice = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            oilPrice[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int minOilPrice = oilPrice[0];
        for (int i = 0; i < N - 1; i++) {
            if (oilPrice[i] < minOilPrice) {
                minOilPrice = oilPrice[i];
            }
            result += (minOilPrice * cities[i]);
        }

        System.out.println(result);
    }
}
