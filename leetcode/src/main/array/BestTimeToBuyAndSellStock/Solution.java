package main.array.BestTimeToBuyAndSellStock;

/**
 * Day2, Array
 * (https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
 * 
 * 아이디어
 * : 최소값을 갱신하며 다음 값과 차의 최대값을 기록
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int currPrice = prices[i];
            if (currPrice < min) {
                min = prices[i];
            }
            if ((currPrice - min) > max) {
                max = currPrice - min;
            }
        }
        return max;
    }
}
