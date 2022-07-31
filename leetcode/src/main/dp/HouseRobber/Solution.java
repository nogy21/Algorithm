package main.dp.HouseRobber;

/**
 * 198. House Robber (https://leetcode.com/problems/house-robber)
 * : You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 *  the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
 *  and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *  Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */
public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];

        int[] dp = {nums[0], Math.max(nums[0], nums[1])};
        int index;
        for (int i = 2; i < len; i++) {
            index = i & 1; // i % 2
            dp[index] = Math.max(nums[i] + dp[index], dp[index ^ 1]); // index^1: 0 -> 1, 1 -> 0
        }
        return Math.max(dp[0], dp[1]);
    }
}