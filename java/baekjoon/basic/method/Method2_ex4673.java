package basic.method;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
 * 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다.
 * 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 
 * 예를 들어, d(75) = 75+7+5 = 87이다.
 */

public class Method2_ex4673 {
	public static void main(String[] args) {
		notSelfNum(1);
	}

	private static void notSelfNum(int n) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		TreeSet<Integer> t2 = new TreeSet<Integer>();

		t = selfnum(n);
		for (int i = 1; i <= 10000; i++) {
			if (!t.contains(i))
				t2.add(i);
		}
		Iterator<Integer> it = t2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static TreeSet<Integer> selfnum(int n) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		int ans = 0;
		while (n <= 10000) {
			ans = n+(n/1000)+((n%1000)/100)+((n%100)/10)+(n%10);;
			t.add(ans);
			n++;
		}
		return t;
	}
}