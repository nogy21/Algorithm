package basic.practice;

/**
 * 다이나믹 프로그래밍 연습 - 피보나치
 */
public class DPTest {
    static long[] bu = new long[101];
    static long[] td = new long[101];
    public static void main(String[] args) {
        int n = 10;
        long value1 = bottomUp(n);
        long value2 = topDown(n);

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
    }

    private static long bottomUp(int x) {
        bu[1] = 1;
        bu[2] = 1;

        for (int i = 3; i <= x; i++) {
            bu[i] = bu[i - 1] + bu[i - 2];
            System.out.println("bottom up: f(" + i + ")");
        }
        return bu[x];
    }

    private static long topDown(int x) {
        System.out.println("top down: f(" + x + ")");
        if (x == 1 || x == 2) {
            return 1;
        }
        if (td[x] != 0) {
            return td[x];
        }
        td[x] = topDown(x - 1) + topDown(x - 2);
        return td[x];
    }
}
