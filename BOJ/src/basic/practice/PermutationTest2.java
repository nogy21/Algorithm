package basic.practice;

/**
 * 순열 연습2 nPr
 * n개의 숫자 중 r개를 순서 고려하여 뽑는 연습
 */
public class PermutationTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permutation(arr, 0, 3);
    }

    private static void permutation(int[] arr, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = depth; i < arr.length; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, r);
            swap(arr, depth, i);
        }
    }

    private static void swap(int[] arr, int depth, int i) {
        int tmp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = tmp;
    }
}
