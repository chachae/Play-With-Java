package com.chachae.leetcode.No_0714;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  /**
   * 我们维护两个变量 \mathrm{cash}cash 和 \mathrm{hold}hold，前者表示当我们不持有股票时的最大利润，后者表示当我们持有股票时的最大利润。
   * <p>
   * 在第 ii 天时，我们需要根据第 i - 1i−1 天的状态来更新 \mathrm{cash}cash 和 \mathrm{hold}hold 的值。对于 \mathrm{cash}cash，我们可以保持不变，或者将手上的股票卖出，状态转移方程为
   * <p>
   * cash = max(cash, hold + prices[i] - fee) 对于 \mathrm{hold}hold，我们可以保持不变，或者买入这一天的股票，状态转移方程为
   * <p>
   * hold = max(hold, cash - prices[i]) 在计算这两个状态转移方程时，我们可以不使用临时变量来存储第 i - 1i−1 天 \mathrm{cash}cash 和 \mathrm{hold}hold 的值，而是可以先计算 \mathrm{cash}cash 再计算
   * \mathrm{hold}hold，原因是在同一天卖出再买入（亏了一笔手续费）一定不会比不进行任何操作好。
   * <p>
   * PythonJava
   * <p>
   * class Solution(object): def maxProfit(self, prices, fee): cash, hold = 0, -prices[0] for i in range(1, len(prices)): cash = max(cash, hold + prices[i] - fee) hold = max(hold, cash - prices[i])
   * return cash
   */

  public static void main(String[] args) {
    int[] nums = {1, 3, 2, 8, 4, 9};
    new Solution().maxProfit(nums, 2);
  }

  // 我们维护两个变量 cash 和 hold，前者表示当我们不持有股票时的最大利润，后者表示当我们持有股票时的最大利润。
  public int maxProfit(int[] p, int fee) {

    if (p == null || p.length <= 1) {
      return 0;
    }

    int cash = 0;
    int hold = -p[0];

    for (int i = 1; i < p.length; i++) {
      cash = Math.max(cash, hold + p[i] - fee);
      hold = Math.max(hold, cash - p[i]);
    }
    return cash;
  }
}