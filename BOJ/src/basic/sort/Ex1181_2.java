package basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * 단어 정렬 (https://www.acmicpc.net/problem/1181)
 */
public class Ex1181_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words= new String[n];

        int i;
        for (i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                if (w1.length() == w2.length()) {
                    return w1.compareTo(w2);
                } else {
                    return w1.length() - w2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(words[0]).append('\n');

        for (i = 1; i < n; i++) {
            if(!words[i].equals(words[i - 1])) {
                sb.append(words[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
