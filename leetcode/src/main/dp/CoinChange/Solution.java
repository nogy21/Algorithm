package main.dp.CoinChange;

import java.util.*;

/**
 * 322. Coin Change (https://leetcode.com/problems/coin-change/)
 * : You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 *  Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *  You may assume that you have an infinite number of each kind of coin.
 *
 * 아이디어 (https://leetcode.com/problems/coin-change/discuss/77409/Evolve-from-brute-force-to-optimal-a-review-of-all-solutions)
 * : 각 접근별 풀이
 *  dfs with memorization and bfs are better because they don't visit invalid states while test cases show that dp is the fastest.
 */
public class Solution {
    // 1. Permutations, O(n^2)
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

    // 2. Memoization, O(ns) pseudo polynomial dfs
    public int coinChangeWithMemoization(int[] coins, int amount) {
        Map<Integer,Integer> map = new HashMap<>();
        return coinChange(coins, amount, map);
    }
    private int coinChange(int[] coins, int amount, Map<Integer,Integer> mem ){
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        Integer c = mem.get(amount);
        if(c != null) return c;
        int cc = -1;
        for (int i = 0; i < coins.length; i++) {
            int coin = coinChange(coins, amount - coins[i], mem);
            if(coin >= 0) {
                cc = cc < 0 ? coin + 1 : Math.min(cc, coin + 1);
            }
        }
        mem.put(amount, cc);
        return cc;
    }

    // 3. DP, O(ns) pseudo polynomial.
    public int coinChangeWithDp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount + 1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++)
            for(int c : coins) {
                if(i >= c) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    // 4. BFS, O(ns).
    public int coinChangeWithBfs(int[] coins, int amount) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int cs = 0;
        boolean[] visited = new boolean[amount + 1];
        while (!q.isEmpty()) {
            int n = q.size();
            for(int i = 0; i < n; i++) {
                int sum = q.poll();
                if(sum == amount) return cs;
                if(sum > amount || visited[sum]) continue;
                visited[sum] = true;
                for(int coin : coins) {
                    q.add(sum + coin);
                }
            }
            cs++;
        }
        return -1;
    }

    // 5. Two end bfs
    public int coinChangeWithBfs2(int[] coins, int amount) {
        Set<Integer> small = new HashSet<>(), large = new HashSet<>();
        small.add(0);
        large.add(amount);
        int steps = 0;
        boolean[] visited = new boolean[amount + 1];
        boolean isBegin = true;
        while (!small.isEmpty() && !large.isEmpty()) {
            if (small.size() > large.size()) {
                Set<Integer> temp = small;
                small = large;
                large = temp;
                isBegin = !isBegin;
            }
            Set<Integer> nxt = new HashSet<>();
            for(int value : small) {
                if(large.contains(value)) {
                    return steps;
                }
                if(value < 0 || value > amount || visited[value]) {
                    continue;
                }
                visited[value] = true;
                for(int coin : coins) {
                    nxt.add(isBegin ? value + coin : value - coin);
                }
            }
            small = nxt;
            steps++;
        }
        return -1;
    }
}
