package basic.array;

import java.util.ArrayList;
import java.util.Scanner;

/* 현수는 학생들에게 노래를 가르치고 있다. 총 N개의 악보가 있고 i번째 악보는 Bi초로 이루어져 있다. 
 * 학생들은 0초부터 1번 악보를 따라 노래하기 시작했다. 
 * 즉 B1-1초에 1번 악보를 끝마치게 되고 B1초부터 B1+B2-1초까지 2번 악보를 따라 부르게 된다.
 * 문제는 T1부터 TQ까지 Q개의 시간에 대해 대답을 하는 것인데, Ti초 때 노래하는 악보를 i번째에 출력하는 것이다.
 * 입력
    첫 줄에는 악보 수 N(1 ≤ N ≤ 100)과 질문의 개수 Q(1 ≤ Q ≤ 1,000)가 주어진다. 
	다음 N개의 줄에는 1번 악보부터 N번 악보까지 각 악보가 차지하는 시간(초)이 한 줄에 하나씩 주어진다. 
	각 악보가 차지하는 시간은 100 이하의 정수이다. 
	다음 Q개의 줄에는 알고자 하는 Q개의 시간(초)이 한 줄에 하나씩 주어진다. 
	묻는 시간 역시 정수만 주어진다.
 * 출력
	Q개에 줄에 1번 질문부터 Q번 질문까지 해당 시간(초)에 부르는 악보의 번호를 출력한다.
 */
public class ArrayEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 악보 수
		int Q = sc.nextInt(); // 질문 수
		int[] n = new int[N];
		int[] t = new int[Q];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) { // N개의 악보가 각각 차지하는 시간
			n[i] = sc.nextInt();
			for(int j=0; j<n[i]; j++)
				list.add(i+1);
		}
		for (int i = 0; i < Q; i++) { // Q개의 줄에 알고자 하는 Q개의 시간
			t[i] = sc.nextInt();
			System.out.println(list.get(t[i]));
		}
		sc.close();
	}
}
