package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex4 {

/**
 * 모험가 길드
 *  공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야 한다.
 *  여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하라.
 *  
 */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 모험가의 수
        int n = Integer.parseInt(br.readLine());
        // 각 모험가의 공포도
        String[] list = br.readLine().split(" ");

        // 오름차순 정렬
        Arrays.sort(list);

        int result = 0; // 총 그룹 수
        int cnt = 0; // 그룹에 속해진 모험가 수

        for(int i = 0; i < n; i++) { // 각 공포도를 확인
            cnt ++; // 그룹에 포함
            if(cnt >= Integer.parseInt(list[i])) { // 그룹에 속한 수가 공포도 이상
                result ++;
                cnt = 0; // 초기화
            }
        }

        System.out.println(result);

    }

}