package lv1.두개뽑아서더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            answer[i++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}
