package basic.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 회전하는 큐 (https://www.acmicpc.net/problem/1021)
 * : 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.
 * 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
 * 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
 * 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
 * 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
 *
 * 아이디어
 * : deque 활용. 목표하는 숫자가 덱의 앞, 뒤 중 가까운 쪽으로 탐색하며 카운트 증가.(이분 탐색)
 * 뽑는 연산은 카운트 증가 X.
 */
public class Ex1021 {
    static LinkedList<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // Queue 입력
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            answer += calcCountToGetTarget(target);
        }
        System.out.println(answer);
    }

    private static int calcCountToGetTarget(int target) {
        int cnt = 0;
        int targetIdx = deque.indexOf(target);
        if (targetIdx == 0) {
            deque.poll();
            return cnt;
        }
        // 중간 인덱스 탐색(짝수라면 하나 앞의 인덱스, 홀수라면 가운데 인덱스)
        int mid, size = deque.size();
        if (size % 2 == 0) {
            mid = deque.size() / 2 - 1;
        } else {
            mid = deque.size() / 2;
        }

        if (targetIdx <= mid) { // 2번 연산
            for (int i = 0; i < targetIdx; i++) {
                int tmp = deque.poll();
                cnt++;
                deque.offer(tmp);
            }
        } else { // 3번 연산
            for (int i = 0; i < deque.size() - targetIdx; i++) {
                int tmp = deque.pollLast();
                cnt++;
                deque.offerFirst(tmp);
            }
        }
        deque.poll();

        return cnt;
    }
}
