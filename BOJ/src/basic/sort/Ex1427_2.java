package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 소트인사이드 (https://www.acmicpc.net/problem/1427)
 * : 입력받은 정수의 각 자리수를 내림차순 정렬
 *
 * Arrays.sort 사용
 */
public class Ex1427_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        long max = sortNumToMaximum(number);
        System.out.println(max);
    }

    private static long sortNumToMaximum(String number) {
        Integer[] arr = new Integer[number.length()];
        for (int i = 0; i < number.length(); i++) {
            arr[i] = number.charAt(i) - '0';
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        String str = "";
        for (int num : arr) {
            str += num;
        }
        return Long.parseLong(str);
    }
}
