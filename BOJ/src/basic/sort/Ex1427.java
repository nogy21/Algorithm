package basic.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 소트인사이드 (https://www.acmicpc.net/problem/1427)
 * : 입력받은 정수의 각 자리수를 내림차순 정렬
 *
 * Collections.sort 사용
 */
public class Ex1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        long max = sortNumToMaximum(number);
        System.out.println(max);
    }

    private static long sortNumToMaximum(String number) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            arr.add(number.charAt(i) - '0');
        }
        Collections.sort(arr, ((o1, o2) -> o2.compareTo(o1)));

        String str = "";
        for (int num : arr) {
            str += num;
        }
        return Long.parseLong(str);
    }
}
