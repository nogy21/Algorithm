package array.ThreeSum;

import java.util.*;

public class Solution {
    /**
     * Brute force
     * O(n^2)
     */
    public List<List<Integer>> threeSumWithBruteForce(int[] nums) {
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

    /**
     * Two pointer
     * O(n^2)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ret = new HashSet<>();
        if (nums.length == 0) {
            return new ArrayList<>(ret);
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ret.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(ret);
    }
}
