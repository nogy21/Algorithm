package main.array.ContainsDuplicate;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    /**
     * 숫자 배열이 주어질 때, 중복된 숫자가 있을 경우 true를 반환하라
     */
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int dupCount = 0;
        for (int num : nums) {
            int tmp = map.getOrDefault(num, 0);
            dupCount += tmp;
            map.put(num, 1);
        }
        boolean answer = dupCount > 0 ? true : false;
        return answer;
    }

    /**
     * Set 활용
     */
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}