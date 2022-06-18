package Programmers.src.main.lv1.숫자문자열과영단어;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    HashMap<String, String> map = new HashMap<>(){{
        put("zero", "0");
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
    }};
    public int solution(String s) {
        for (String word : map.keySet()) {
            s = s.replaceAll(word, map.get(word));
        }
        return Integer.parseInt(s);
    }
}
