package basic.practice;

/**
 * 조합 연습
 * nCr n 개 중 r 개를 순서 상관 없이 뽑아서 출력하는 연습
 */
public class CombinationTest {
    public static int r;
    public static int[] arr, result;
    public static boolean[] checkList;
    public static void main(String[] args) {
        r = 2;
        arr = new int[]{1, 2, 3};
        result = new int[r];
        checkList = new boolean[arr.length];
        dfs(0, 0); // depth, begin with
    }

    private static void dfs(int depth, int beginWith) {
        if (depth == r) {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = beginWith; i < arr.length; i++) {
            result[depth] = arr[i];
            dfs(depth + 1, i + 1);
        }
    }

}
