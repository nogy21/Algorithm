package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 문자의 재정렬
 *  알파벳 대문자와 숫자(0 ~ 9)로만 구성된 문자열이 입려으로 주어짐.
 *  모든 알파벳을 오름차순으로 정렬하여 출력한 디 모든 숫자를 더한 값을 이어서 출력하라
 * -----------
 * 입력 예시: K1KA5CB7
 * 출력 예시: ABCKK13
 */
public class ex4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> alphabet = new ArrayList<>();
        int i, num = 0;

        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) < 'A') {
                num += input.charAt(i) - '0';
            } else {
                alphabet.add(String.valueOf(input.charAt(i)));
            }
        }
        Collections.sort(alphabet);
        for (i = 0; i < alphabet.size(); i++) {
            System.out.print(alphabet.get(i));
        }
        System.out.println(num);
        br.close();
    }

}
