package main.dp.HouseRobber2;

/**
 * 213. House Robber II (https://leetcode.com/problems/house-robber-ii)
 * : You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
 *  All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
 *  Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *  Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int withFirstWithoutLast = solve(nums, 0, nums.length - 2);
        int withLastWithoutFirst = solve(nums, 1, nums.length - 1);

        return Math.max(withFirstWithoutLast, withLastWithoutFirst);
    }

    public int solve(int[] nums, int start, int end){
        if (start == end) return nums[start];

        int money[] = new int[nums.length];
        money[start] = nums[start];
        money[start + 1] = Math.max(nums[start + 1], nums[start]);

        for (int i = start + 2; i <= end; i++) {
            money[i] = Math.max(money[i - 1], money[i - 2] + nums[i]);
        }

        return money[end];
    }
}