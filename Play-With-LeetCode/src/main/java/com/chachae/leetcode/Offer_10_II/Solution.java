package com.chachae.leetcode.Offer_10_II;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int numWays(int n) {
    if (n < 2) {
      return 1;
    }
    int a = 1;
    int b = 1;
    for (int i = 2; i <= n; i++) {
      a = a + b;
      b = a - b;
      a = a >= 1000000007 ? (a - 1000000007) : a;
    }
    return a;
  }

}