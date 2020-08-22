package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/integer-break/ 动态规划
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 10:31
 */
public class IntegerBreak_2 {

  private int max3(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }

  public int integerBreak(int n) {
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      for (int j = 1; j <= i - j; j++) {
        dp[i] = max3(dp[i], j * (i - j), j * dp[i - j]);
      }
    }
    return dp[n];
  }
}