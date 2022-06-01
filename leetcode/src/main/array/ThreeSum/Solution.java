package array.ThreeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> tmpMap = new HashMap<>();

        if (nums == null || nums.length <= 2) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> tmpList = new ArrayList<>();
                int diff = - nums[i] - nums[j];
                if (tmpMap.containsKey(diff) && tmpMap.get(diff) != i && tmpMap.get(diff) != j) {
                    tmpList.add(nums[i]);
                    tmpList.add(nums[j]);
                    tmpList.add(diff);

                    Collections.sort(tmpList);
                    resultSet.add(tmpList);
                }
                tmpMap.put(nums[i], i);
                tmpMap.put(nums[j], j);
            }
        }
        result.addAll(resultSet);

        return result;
    }
}
