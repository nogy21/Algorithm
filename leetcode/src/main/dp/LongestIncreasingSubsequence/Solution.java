package main.dp.LongestIncreasingSubsequence;

/**
 * 300. Longest Increasing Subsequence (https://leetcode.com/problems/longest-increasing-subsequence/)
 * : Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *  A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements.
 *  For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 * 아이디어
 * : DP, LIS
 * 길이별 LIS 배열 리스트 갱신
 *
 * 예) {0, 8, 4, 12, 2, 10, 6, 14, 1, 9}
 * A[0] = 0. Case 1. There are no active lists, create one.
 * 0.
 * -----------------------------------------------------------------------------
 * A[1] = 8. Case 2. Clone and extend.
 * 0.
 * 0, 8.
 * -----------------------------------------------------------------------------
 * A[2] = 4. Case 3. Clone, extend and discard.
 * 0.
 * 0, 4.
 * 0, 8. Discarded
 * -----------------------------------------------------------------------------
 * A[3] = 12. Case 2. Clone and extend.
 * 0.
 * 0, 4.
 * 0, 4, 12.
 * -----------------------------------------------------------------------------
 * A[4] = 2. Case 3. Clone, extend and discard.
 * 0.
 * 0, 2.
 * 0, 4. Discarded.
 * 0, 4, 12.
 * -----------------------------------------------------------------------------
 * A[5] = 10. Case 3. Clone, extend and discard.
 * 0.
 * 0, 2.
 * 0, 2, 10.
 * 0, 4, 12. Discarded.
 * -----------------------------------------------------------------------------
 * A[6] = 6. Case 3. Clone, extend and discard.
 * 0.
 * 0, 2.
 * 0, 2, 6.
 * 0, 2, 10. Discarded.
 * -----------------------------------------------------------------------------
 * A[7] = 14. Case 2. Clone and extend.
 * 0.
 * 0, 2.
 * 0, 2, 6.
 * 0, 2, 6, 14.
 * -----------------------------------------------------------------------------
 * A[8] = 1. Case 3. Clone, extend and discard.
 * 0.
 * 0, 1.
 * 0, 2. Discarded.
 * 0, 2, 6.
 * 0, 2, 6, 14.
 * -----------------------------------------------------------------------------
 * A[9] = 9. Case 3. Clone, extend and discard.
 * 0.
 * 0, 1.
 * 0, 2, 6.
 * 0, 2, 6, 9.
 * 0, 2, 6, 14. Discarded.
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        // Add boundary case, when array size is one
        int[] tailTable = new int[nums.length];
        int len; // always points empty slot

        tailTable[0] = nums[0];
        len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < tailTable[0])
                // new smallest value
                tailTable[0] = nums[i];

            else if (nums[i] > tailTable[len - 1])
                // nums[i] wants to extend largest subsequence
                tailTable[len++] = nums[i];

            else
                // nums[i] wants to be current end candidate of an existing
                // subsequence. It will replace ceil value in tailTable
                tailTable[ceilIndex(tailTable, -1, len - 1, nums[i])] = nums[i];
        }

        return len;
    }

    // Binary search (note boundaries in the caller)
    // A[] is ceilIndex in the caller
    static int ceilIndex(int A[], int l, int r, int key)
    {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] >= key)
                r = m;
            else
                l = m;
        }

        return r;
    }
}
