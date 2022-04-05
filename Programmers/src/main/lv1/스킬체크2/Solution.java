package main.lv1.스킬체크2;

public class Solution {

    public boolean solution(int x) {
        String str = Integer.toString(x);
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num += str.charAt(i) - '0';
        }
        System.out.println(num);

        return x % num == 0;
    }

}
