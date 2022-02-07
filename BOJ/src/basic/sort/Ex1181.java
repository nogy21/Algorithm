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
public class Ex1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> words = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        String[] noDuplications = words.toArray(new String[0]);

        Arrays.sort(noDuplications, new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                if (w1.length() < w2.length()) {
                    return -1;
                } else if (w1.length() == w2.length()) {
                    return w1.compareTo(w2);
                } else {
                    return 1;
                }
            }
        });

        for (String word : noDuplications) {
            System.out.println("word = " + word);
        }
    }
}
