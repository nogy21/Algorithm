 package main.binary.CountingBits;

/**
 * 338. Counting Bits (Easy)
 * : Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 *  ans[i] is the number of 1's in the binary representation of i.
 *
 * Example 1:
 *  Input: n = 10
 *  Output: [0,1,1,2,1,2]
 *  Explanation:
 *  0 --> 0         0
 *  1 --> 1         1
 *  2 --> 10        1
 *  3 --> 11        2
 *  4 --> 100       1
 *  5 --> 101       2
 *  6 --> 110       2
 *  7 --> 111       3
 *  8 --> 1000      1
 *  9 --> 1001      2
 *  10 --> 1010     2
 *  11 --> 1011     3
 *  12 --> 1100     2
 *  13 --> 1101     3
 *  14 --> 1110     3
 *  15 --> 1111     4
 *    2  4    8         16
 *  0112 1223 1223 2334 1223 2334 ...
 * Constraints:
 *  0 <= n <= 105
 *
 * Follow up
 * : It is very easy to come up with a solution with a runtime of O(n log n).
 *  Can you do it in linear time O(n) and possibly in a single pass?
 *  Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 */
public class Solution {
    // f[i] = f[i / 2] + i % 2
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            answer[i] = answer[i >> 1] + (i & 1);
        }
        return answer;
    }

    // dp[index] = dp[index - offset] + 1;
    public int[] countBits2(int n) {
        int[] answer = new int[n + 1];
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset *= 2;
            }
            answer[i] = answer[i - offset] + 1;
        }
        return answer;
    }
}
