package main.lv2.스킬체크1;

public class Solution {
    /**
     * 1 2 3  4  5  6  7  8  9 10
     * 1 2 4 11 12 14 21 22 24 41
     * 3을 나눈 나머지가 0 -> 4, 1 -> 1, 2 -> 2
     * 단, 3으로 나누어 떨어지는 경우 예외 발생
     * -> 나눈 뒤 -1 적용
     */

    public String solution(int n) {
        String answer = "";
        String[] arr = {"4", "1", "2"};

        while(n > 0) {
            int mod = n % 3;
            answer = arr[mod] + answer;

            n /= 3;

            if (mod == 0) {
                n--;
            }
        }

        return answer;
    }

}
