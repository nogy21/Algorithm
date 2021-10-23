package basic.method;
//  ���ڿ� ��ġ�� �̿��Ͽ� Ǯ��.

public class Method2_ex4673_charAt {
	public static void main(String[] args) {
		boolean[] check = new boolean[10000];

		for (int n = 1; n < check.length; n++) {
			int dn = n;
			String str = Integer.toString(n);
			int sLen = str.length();
			for (int i = 0; i < sLen; i++)
				dn += (str.charAt(i) - '0');
			if (dn < check.length)
				check[dn] = true;
		}
		for (int i = 1; i < check.length; i++) {
			if (!check[i])
				System.out.println(i);
		}
	}
}