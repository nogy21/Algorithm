package basic.method;

//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

public class Method1_ex15596 {
	public long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}