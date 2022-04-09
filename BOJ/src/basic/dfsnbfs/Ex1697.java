package basic.dfsnbfs;

import java.util.*;

/**
 * 숨바꼭질 (https://www.acmicpc.net/problem/1697)
 * - N이 주어졌을 때 K에 도달하기 위해 1초에 X-1 or X+1 or X*2 로 이동할 수 있다.
 * 
 * 아이디어
 * 1. 이동 방식은 세 가지 X-1, X+1, X*2 => 증가 2가지 감소 1가지
 *    => 즉, K가 N보다 작으면 N-K 만큼의 시간 필요
 * 2. K가 N보다 클 경우 세 가지 방식을 모두 사용해서 탐색
 *    => DFS는 되돌아오기 어려우므로 제외. BFS로 큐 사용 => 이미 방문한 위치는 재방문 X
 *    => boolean 형태의 visit 배열 대신 정수형 배열을 사용해서 연산 횟수 기록
 * 2-1. 첫 위치 큐에 삽입. 세 가지 방식으로 탐색 가능한지 각각 확인 후 큐에 추가
 * 2-2. 탐색은 0 < N <= K 범위 내에서 각 연산에 맞게 범위 조정 
 * 2-3. 현재 위치가 K일 때 연산 횟수 반환. 종료
 * 
 */

public class Ex1697 {
    static int N, K;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        if (N >= K) {
            System.out.println(N - K);
        } else {
            bfs();
        }

        System.out.println(arr[K]);
    }


    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        arr = new int[K * 2 + 1];

        while (!q.isEmpty()) {
            int currPos = q.poll();

            if (currPos == K) {
                break;
            }

            offerNextPosition(q, currPos, currPos - 1);
            offerNextPosition(q, currPos, currPos + 1);
            offerNextPosition(q, currPos, currPos * 2);
        }
    }

    private static void offerNextPosition(Queue<Integer> q, int currPos, int nextPos) {
        if (nextPos >= 0 && arr[nextPos] == 0) {
            arr[nextPos] = arr[currPos] + 1;
            q.offer(nextPos);
        }
    }
}