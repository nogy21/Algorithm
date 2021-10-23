package basic.method;

import java.util.Iterator;
import java.util.TreeSet;

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