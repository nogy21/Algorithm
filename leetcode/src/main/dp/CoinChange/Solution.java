package main.dp.CoinChange;

/**
 * 322. Coin Change (https://leetcode.com/problems/coin-change/)
 * : You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 *  Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *  You may assume that you have an infinite number of each kind of coin.
 *
 * 아이디어
 * :
 */
public class Solution {
    // Permutations, O(n^2)
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        int n = -1;
        for(int i = 0; i < coins.length; i++) {
            int coin = coinChange(coins, amount - coins[i]);
            if (coin >= 0) {
                n = n < 0 ? coin + 1 : Math.min(n, coin + 1);
            }
        }
        return n;
    }
}
