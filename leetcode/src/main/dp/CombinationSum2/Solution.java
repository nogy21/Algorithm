package main.dp.CombinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. Combination Sum II (https://leetcode.com/problems/combination-sum-ii/)
 * : Given a collection of candidate numbers (candidates) and a target number (target),
 *  find all unique combinations in candidates where the candidate numbers sum to target.
 *  Each number in candidates may only be used once in the combination.
 *  Note: The solution set must not contain duplicate combinations.
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>(), list);
        return list;
    }
    private void backtrack(int[] candidates, int start, int target,
                        List<Integer> tempList, List<List<Integer>> list){
        if (target < 0) return;
        if (target == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            tempList.add(candidates[i]);
            backtrack(candidates, i + 1,target - candidates[i], tempList, list);
            tempList.remove(tempList.size() - 1);
        }
    }
}
