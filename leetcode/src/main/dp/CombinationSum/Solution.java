package main.dp.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum (https://leetcode.com/problems/combination-sum/)
 * : Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order. The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 *
 */
public class Solution {
    public List<List<Integer>> combinationSumWithDP(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>[] dp = new ArrayList[target + 1];

        for(int i = 0; i <= target; i++) {
            dp[i] = new ArrayList();
            List<List<Integer>> combList = new ArrayList();

            for(int j = 0; j < candidates.length && candidates[j] <= i; j++) {
                if (candidates[j] == i) {
                    combList.add(Arrays.asList(candidates[j]));
                } else {
                    for (List<Integer> prev: dp[i - candidates[j]]) {
                        if (candidates[j] >= prev.get(prev.size() - 1)) {
                            List temp = new ArrayList(prev);
                            temp.add(candidates[j]);
                            combList.add(temp);
                        }
                    }
                }
            }
            dp[i] = combList;
        }
        return dp[target];
    }

    public List<List<Integer>> combinationSumWithDFS(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, target, 0, temp, result);
        return result;
    }
    private void helper(int[] candidates, int start, int target, int sum,
                        List<Integer> list, List<List<Integer>> result){
        if (sum > target) return;
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            helper(candidates, i, target, sum+candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}
