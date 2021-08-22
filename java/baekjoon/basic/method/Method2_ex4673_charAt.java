package basic.method;
//  문자열 위치를 이용하여 풀이.

public class Method2_ex4673_charAt {
	public static void main(String[] args) {
		boolean[] check = new boolean[10000]; // 셀프넘버 여부만 판단하면 되기에 boolean 배열

		for (int n = 1; n < check.length; n++) {
			int dn = n;
			String str = Integer.toString(n);
			int sLen = str.length();
			for (int i = 0; i < sLen; i++)
				dn += (str.charAt(i) - '0');  // charAt을 활용, 자기 자신과 각 자리수를 더함
			if (dn < check.length)
				check[dn] = true;  // 셀프넘버일 경우 true 할당
		}
		for (int i = 1; i < check.length; i++) {
			if (!check[i])
				System.out.println(i);
		}
	}
}