package lv1.수박수박수박수박수박수;

/**
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 */
public class Solution {
    public String solution(int n) {
        String one = "수";
        String whole = "수박";
        if (n == 1) return one;
        if (n == 2) return whole;
        if (n % 2 == 0) {
            return repeat(n / 2, whole);
        }
        return repeat(n / 2, whole) + one;
    }

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }
}
