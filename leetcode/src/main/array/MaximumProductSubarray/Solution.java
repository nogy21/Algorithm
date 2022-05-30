package array.MaximumProductSubarray;

/**
 * 53. Maximum Subarray
 * : Given an integer array nums, find the contiguous subarray (containing at least one number)
 *  which has the largest sum and return its sum. A subarray is a contiguous part of an array.
 *
 * 아이디어
 * : 음수값은 다음에 음수를 만날 경우 최대값이 되기에 최소값과 최대값을 모두 갱신
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int product = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int multiplyMinByCurr = nums[i] * min;
            int multiplyMaxByCurr = nums[i] * max;
            min = Math.min(Math.min(multiplyMinByCurr, nums[i]), multiplyMaxByCurr);
            max = Math.max(Math.max(multiplyMinByCurr, nums[i]), multiplyMaxByCurr);

            product = Math.max(max, product);
        }

        return product;
    }
}