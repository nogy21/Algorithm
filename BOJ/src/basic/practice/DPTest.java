package basic.practice;

/**
 * 다이나믹 프로그래밍 연습 - 피보나치
 */
public class DPTest {
    static long[] bu = new long[101];
    static long[] td = new long[101];
    public static void main(String[] args) {
        int n = 100;
        long value1 = bottomUp(n);
        long value2 = topDown(n);

        System.out.println(value1);
        System.out.println(value2);
    }

    private static long bottomUp(int n) {
        bu[1] = 1;
        bu[2] = 1;

        for (int i = 3; i <= 100; i++) {
            bu[i] = bu[i - 1] + bu[i - 2];
        }
        return bu[n];
    }

    private static long topDown(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else if (td[x] != 0) {
            return td[x];
        } else {
            td[x] = topDown(x - 1) + topDown(x - 2);
            return td[x];
        }
    }
}
