package main.array.TwoSome;

import java.util.HashMap;

public class Solution {
    public int[] twoSumVer1(int[] nums, int target) {
        int sum = 0;
        int[] answer = new int[2];
        Loop:
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break Loop;
                }
            }
        }
        return answer;
    }

    /**
     * 이중 반복문이 아닌, Map을 활용한 한 번의 반복문으로 효율적으로 접근
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumVer2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.get(complement) != null) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}