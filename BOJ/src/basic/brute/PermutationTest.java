package basic.brute;

/**
 * 순열 예제
 */
public class PermutationTest {
    public static int n;
    public static char[] data;
    public static void main(String[] args) {
        n = 4;
        data = new char[]{'a','b','c','d'};
        perm(0);
    }
    private static void perm(int k) {
        if (k == n) {
            System.out.println(data);
            return;
        }
        for (int i = k; i < n; i++) {
            swap(data, k, i);
            perm(k + 1);
            swap(data, k, i);
        }
    }

    private static void swap(char[] data, int k, int i) {
        char tmp = data[k];
        data[k] = data[i];
        data[i] = tmp;
    }
}
