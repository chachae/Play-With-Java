package com.chachae.leetcode.interview.array;

/**
 * <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">122. 买卖股票的最佳时机
 * II</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/30 19:37
 */
public class No122 {

  public static void main(String[] args) {
    int[] nums = {7, 1, 5, 3, 6, 4};
    System.out.println(new No122().maxProfit(nums));
  }

  public int maxProfit(int[] prices) {
    int res = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        res += (prices[i] - prices[i - 1]);
      }
    }
    return res;
  }
}
