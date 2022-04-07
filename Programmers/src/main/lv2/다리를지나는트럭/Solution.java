package main.lv2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 고득점 Kit 스택/큐
 * - 다리를 지나는 트럭 (https://programmers.co.kr/learn/courses/30/lessons/42583)
 * - 다리에는 트럭이 최대 bridge_length 대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다.
 *
 * 1. 다리 위 트럭 시간 증가 -> 시간이 다리 길이와 같아진 경우 트럭 제거
 * 2. 다리 위 트럭 수 & 무게 허용 -> 트럭 한 대 진입
 */
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 1;

        Queue<Truck> q = new LinkedList<>();
        // 큐에 다리를 건너는 트럭 입력
        int truckIdx = 0;
        q.offer(new Truck(truck_weights[truckIdx], truckIdx, 0));
        // 다리 위 무게
        int curr_weight = truck_weights[truckIdx];

        while (!q.isEmpty()) {
            time++;

            // 다리 위 트럭의 시간 증가
            for (Truck truck : q) {
                truck.increaseTime();
            }

            // 다리를 지나면 트럭 제거
            if (q.peek().getElapsedTime() == bridge_length) {
                curr_weight -= q.poll().getWeight();
            }

            // 총 트럭 수 이하 & 무게 & 다리 위 트럭 수  -> 트럭 추가
            if (truckIdx + 1 < truck_weights.length && curr_weight + truck_weights[truckIdx + 1] <= weight && q.size() <= bridge_length) {
                truckIdx++;
                q.offer(new Truck(truck_weights[truckIdx], truckIdx, 0));
                curr_weight += truck_weights[truckIdx];
            }
        }

        return time;
    }

    private class Truck {
        int weight, idx, elapsedTime;

        public Truck(int weight, int idx, int elapsedTime) {
            this.weight = weight;
            this.idx = idx;
            this.elapsedTime = elapsedTime;
        }

        public int getWeight() {
            return weight;
        }

        public int getIdx() {
            return idx;
        }

        public int getElapsedTime() {
            return elapsedTime;
        }

        public void increaseTime() {
            elapsedTime++;
        }
    }
}
