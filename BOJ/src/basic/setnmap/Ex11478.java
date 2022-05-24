package basic.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 서로 다른 부분 문자열의 개수 (https://www.acmicpc.net/problem/11478)
 * : 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
 * 부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
 * <p>
 * 아이디어
 * : set 사용, 생성 가능한 모든 문자열 입력
 */
public class Ex11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            String str = "";
            for (int j = i; j < input.length(); j++) {
                str += input.substring(j, j+1);
//                System.out.println(str);
                set.add(str);
            }
        }

        System.out.println(set.size());
    }
}
