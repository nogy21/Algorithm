package basic.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 회의실 배정 (https://www.acmicpc.net/problem/1931)
 * : 한 개의 회의실을 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.
 *  각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
 *  (단, 회의는 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.)
 *  
 * 아이디어
 * : 종료 시간을 우선으로 하여 정렬. 종료 시간이 같을 경우 시작 시간 정렬.
 */
public class Ex1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Room> arr = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Room(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(arr);

        int cnt = 0, previousTime = 0;
        for (int i = 0; i < N; i++) {
            if (previousTime <= arr.get(i).startTime) {
                previousTime = arr.get(i).endTime;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static class Room implements Comparable<Room>{
        int startTime;
        int endTime;

        public Room(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Room r) {
            if (endTime == r.endTime) {
                return startTime - r.startTime;
            }
            return endTime - r.endTime;
        }
    }
}
