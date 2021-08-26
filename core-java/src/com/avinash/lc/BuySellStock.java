package com.avinash.lc;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {0, 6, -3, 7};
        int result = maxProfit1(prices);
        System.out.println(result);
    }

    // Kadane's algorithm (slower)
    private static int maxProfit1(int[] prices) {
        int maxCurrent = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxCurrent = maxCurrent + prices[i] - prices[i - 1];
            maxCurrent = Math.max(0, maxCurrent);
            maxProfit = Math.max(maxProfit, maxCurrent);
        }
        return maxProfit;
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
