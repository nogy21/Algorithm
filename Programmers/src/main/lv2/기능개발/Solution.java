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
 *
 */

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int time = calcRequiredTime(progresses[i], speeds[i]);

            if (!q.isEmpty() && q.peek() < time) {
                answerList.add(q.size());
                q.clear();
            }
            q.offer(time);
        }
        answerList.add(q.size());

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private int calcRequiredTime(double currProgress, double currSpeed) {
        double time = (100 - currProgress) / currSpeed;
        return (int) Math.ceil(time);
    }
}
