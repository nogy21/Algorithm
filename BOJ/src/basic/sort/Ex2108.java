package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 통계학 (https://www.acmicpc.net/problem/2108)
 * <p>
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */
public class Ex2108 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while (n-- > 0) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        findAllStatistic(arr);

        System.out.println(sb);
    }

    private static void findAllStatistic(ArrayList<Integer> arr) {
        // 산술평균
        sb.append(calcArithmeticMean(arr)).append("\n");
        // 중앙값
        sb.append(calcMedianValue(arr)).append("\n");
        // 최빈값
        sb.append(calcMode(arr)).append("\n");
        // 범위
        sb.append(calcDiffBetweenMaxAndMin(arr)).append("\n");
    }

    private static int calcArithmeticMean(ArrayList<Integer> arr) {
        double sum = 0;
        for (Integer val : arr) {
            sum += val;
        }

        double avg = sum / arr.size();

        return (int) Math.round(avg);
    }

    private static int calcMedianValue(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int mid = arr.size() / 2;
        return arr.get(mid);
    }

    private static int calcMode(ArrayList<Integer> arr) {
        int max = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int val : arr) {
            list.offer(val);
        }
        // 빈도 수 파악
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = list.size();
        while (!list.isEmpty()) {
            int currVal = list.poll();
            int cnt = 0;
            for (int i = 0; i < list.size(); i++) {
                if (currVal == list.get(i)) {
                    cnt++;
                    list.remove(i);
                }
            }
            if (max <= cnt) {
                max = cnt;
                map.put(currVal, cnt);
            }
        }

        ArrayList<Integer> modeArr = new ArrayList<>();
        int cnt = 0, idx = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                modeArr.add(entry.getKey());
            }
        }
        if (modeArr.size() >= 2) {
            Collections.sort(modeArr);
            return modeArr.get(1);
        }

        return modeArr.get(0);
    }

    private static int calcDiffBetweenMaxAndMin(ArrayList<Integer> arr) {
        return arr.get(arr.size() - 1) - arr.get(0);
    }
}
