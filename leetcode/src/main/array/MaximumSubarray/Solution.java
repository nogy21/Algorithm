package main.array.MaximumSubarray;

/**
 * 53. Maximum Subarray
 * : Given an integer array nums, find the contiguous subarray (containing at least one number)
 *  which has the largest sum and return its sum. A subarray is a contiguous part of an array.
 *
 * 아이디어
 * : DP[n] = Math.max(DP[n-1] + arr[n], arr[n])
 * but, 자료구조와 Math.max() 사용 없이, 값을 더해가며 음수가 될 때 초기화해주는 것으로도 구현 가능(이 방법이 더 빠름)
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] arr = new int[nums.length];
        int answer = arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = Math.max(arr[i - 1] + nums[i], nums[i]);
            answer = Math.max(answer, arr[i]);
        }
        return answer;
    }

    public int maxSubArrayFaster(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}