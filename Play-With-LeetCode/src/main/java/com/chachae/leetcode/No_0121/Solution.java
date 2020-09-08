package com.chachae.leetcode.No_0121;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int start = 0;
    int end = prices.length - 1;
    int s = prices[start];
    int res = 0;
    while (start != end) {
      for (int i = start + 1; i < prices.length; i++) {
        if (s < prices[i]) {
          res = Math.max(res, prices[i] - s);
        }
      }
      s = prices[++start];
    }
    return res;
  }
}