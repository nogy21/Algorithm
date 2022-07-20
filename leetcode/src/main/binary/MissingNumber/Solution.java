package main.binary.MissingNumber;

/**
 * 268. Missing Number (https://leetcode.com/problems/missing-number/)
 * : Given an array nums containing n distinct numbers in the range [0, n],
 *  return the only number in the range that is missing from the array.
 *
 */
public class Solution {
    // simple code, O(n)
    public int missingNumber(int[] nums) {
        int left = nums.length;
        for (int i = 0; i < nums.length; i++) {
            left += i;
            left -= nums[i];
        }
        return left;
    }

    // Using xor operation, O(n)
    public int missingNumber2(int[] nums) {
        int xor = 0, i;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}
