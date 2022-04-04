package main.lv2.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 고득점 Kit 스택/큐
 * - 기능개발 (https://programmers.co.kr/learn/courses/30/lessons/42586)
 *
 * 아이디어
 * : 스택 활용
 * - 먼저 입력받은 기능을 완료할 때 까지 시간 경과 -> 필요한 시간만큼 다른 요소들도 작업율 증가
 * - 완료한 작업은 카운트, 먼저 입력받은 기능의 완료와 함께 완료 처리
 */

public class Solution {
    static Queue<Work> q = new LinkedList<>();
    static ArrayList<Integer> answerList = new ArrayList<>();

    public int[] solution(int[] progresses, int[] speeds) {

        for (int i = 0; i < progresses.length; i++) {
            q.add(new Work(progresses[i], speeds[i]));
        }

        bfs();

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private void bfs() {
        while (!q.isEmpty()) {
            Work currWork = q.peek();

            // 현재 작업 완료
            if (currWork.isDone()) {
                int cnt = 0;

                // 작업이 완료된 모든 작업들을 카운트, 완료되지 않은 작업은 다시 q에 적재
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Work w = q.peek();

                    if (w.isDone()) {
                        cnt++;
                        q.poll();
                    } else {
                        break;
                    }
                }
                answerList.add(cnt);
            } else {
                int t = calcRequiredTime(currWork);

                for (Work w : q) {
                    w.work(t);
                }
            }
        }
    }

    private int calcRequiredTime(Work currWork) {
        int ret = (100 - currWork.getProgress()) / currWork.getSpeed();
        /*if ((100 - currWork.getProgress()) % currWork.getSpeed() == 0) {
            return ret;
        } else {
            return ret + 1;
        }*/
        return (100 - currWork.getProgress()) % currWork.getSpeed() == 0 ? ret : ret + 1;
    }

    private class Work {
        int progress;
        int speed;

        public Work(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public int getProgress() {
            return progress;
        }

        public int getSpeed() {
            return speed;
        }

        public void work(int time) {
            progress += speed * time;
        }

        public boolean isDone() {
            if (progress >= 100) {
                return true;
            } else {
                return false;
            }
        }
    }
}
