package main.dp.ClimbingStairs;

/**
 * 70. Climbing Stairs
 * : You are climbing a staircase. It takes n steps to reach the top.
 *  Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1: Input: n = 2, Output: 2
 *  Explanation: There are two ways to climb to the top.
 *  1. 1 step + 1 step
 *  2. 2 steps

 * Example 2: Input: n = 3, Output: 3
 *  Explanation: There are three ways to climb to the top.
 *  1. 1 step + 1 step + 1 step
 *  2. 1 step + 2 steps
 *  3. 2 steps + 1 step
 *
 * Constraints: 1 <= n <= 45
 *
 * 아이디어
 * : DP, f(n) = f(n-1) + f(n-2)
 * 2 => 1 + 1,
 *      2
 * 3 => (1 + 1) + 1,
 *      (2) + 1,
 *      1 + 2
 * 4 => ((1 + 1) + 1) + 1,
 *      ((2) + 1) + 1,
 *      (1 + 2) + 1,
 *      (1 + 1) + 2,
 *      (2) + 2
 * 5 => (((1 + 1) + 1) + 1) + 1,
 *      (((2) + 1) + 1) + 1,
 *      ((1 + 2) + 1) + 1,
 *      ((1 + 1) + 2) + 1,
 *      ((2) + 2) + 1,
 *      ((1 + 1) + 1) + 2,
 *      ((2) + 1) + 2,
 *      (1 + 2) + 2,
 * 6 => ((((1 + 1) + 1) + 1) + 1) + 1, ...
 */
public class Solution {
    int dp[] = new int[46];
    public int climbStairs(int n) {
        if (n <= 3) return n;
        for (int i = 0; i <= 3; i++) {
            dp[i] = i;
        }
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
